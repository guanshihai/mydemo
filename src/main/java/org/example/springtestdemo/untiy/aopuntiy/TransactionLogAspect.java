package org.example.springtestdemo.untiy.aopuntiy;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.springtestdemo.entity.thruser.User;
import org.example.springtestdemo.service.thruserservice.OperationLogService;
import org.example.springtestdemo.untiy.aopannotation.TransactionLog;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * AOP 切面类：记录操作日志
 */
@Aspect
@Component
public class TransactionLogAspect {
    // ...

    @Autowired
    private OperationLogService operationLogService;


    // 环绕通知：拦截带 @TransactionLog 注解的方法
    @Around("@annotation(transactionLog)")
    public Object logAround(ProceedingJoinPoint joinPoint, TransactionLog transactionLog ) throws Throwable {
        Object result;
        try {
            // 1. 执行业务方法
            result = joinPoint.proceed();
            // 2. 成功：记录成功日志（独立事务）
            operationLogService.saveLog(transactionLog.successMsg() + getUserName(joinPoint));
            return result;
        } catch (Throwable e) {
            // 3. 失败：记录失败日志（独立事务）
            operationLogService.saveLog(transactionLog.failMsg()  + getUserName(joinPoint)+"，原因：" + e.getMessage() );
            // 4. 必须抛出异常，让事务回滚
            throw e;
        }
    }

    // 辅助方法：从参数里获取用户名
    private String getUserName(@NonNull ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg instanceof User) {
                return ((User) arg).getName();
            }
        }
        return "未知用户";
    }

}

