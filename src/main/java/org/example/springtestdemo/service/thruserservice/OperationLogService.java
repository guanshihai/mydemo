package org.example.springtestdemo.service.thruserservice;

public interface OperationLogService {

    /**
     * 保存操作日志
     * @param operation
     */
    public void saveLog(String operation);
}
