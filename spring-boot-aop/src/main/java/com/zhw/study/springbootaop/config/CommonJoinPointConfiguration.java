package com.zhw.study.springbootaop.config;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author innerpeacez
 * @since 2019/1/7
 * 管理所有的切面
 */
public class CommonJoinPointConfiguration {

    @Pointcut("execution(* com.zhw.study.springbootaop.controller.*.*(..))")
    public void requestAndResponseAspect() {
    }

}
