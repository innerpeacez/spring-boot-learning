package com.zhw.study.springbootannotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Transactional
@Service
public @interface TransactionalService {
    @AliasFor(attribute = "value")
    String name() default "innerpeacez";

    @AliasFor("name")
    String value() default "";

    @AliasFor(attribute = "transactionManager", annotation = Transactional.class)
    String manager() default "txManager";
}
