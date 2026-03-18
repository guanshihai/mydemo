package org.example.springtestdemo.untiy.aopannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TransactionLog {
    String successMsg(); // 成功时的日志前缀
    String failMsg();    // 失败时的日志前缀
}