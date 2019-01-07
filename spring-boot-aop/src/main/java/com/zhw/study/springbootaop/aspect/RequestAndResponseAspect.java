package com.zhw.study.springbootaop.aspect;

import com.zhw.study.springbootaop.common.ResultBean;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author innerpeacez
 * @since 2019/1/7
 * 请求日志和统一返回值的切面
 */
@Aspect
@Component
@Slf4j
public class RequestAndResponseAspect {

    @Before("com.zhw.study.springbootaop.config.CommonJoinPointConfiguration.requestAndResponseAspect()")
    public void printRequestLog(JoinPoint joinPoint) {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        log.info("URL : " + request.getRequestURL().toString());
        log.info("HTTP_METHOD_TYPE : " + request.getMethod());
        log.info("IP : " + request.getRemoteAddr());
        log.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
    }

    @Around("com.zhw.study.springbootaop.config.CommonJoinPointConfiguration.requestAndResponseAspect()")
    public ResultBean<Object> requestAndResponse(ProceedingJoinPoint joinPoint) {
        long startTime = System.currentTimeMillis();
        try {
            Object proceed = joinPoint.proceed();
            return new ResultBean<>(proceed);
        } catch (Throwable e) {
            return new ResultBean<>(e);
        } finally {
            // 打印处理时间
            long timeTaken = System.currentTimeMillis() - startTime;
            log.info("Request processing time of {} is {} millisecond", joinPoint, timeTaken);
        }
    }
}
