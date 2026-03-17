package org.example.springtestdemo.service.impl.thruserserviceimpl;

import org.example.springtestdemo.entity.thruser.OperationLog;
import org.example.springtestdemo.mapper.thrusermapper.OperationLogMapper;
import org.example.springtestdemo.service.thruserservice.OperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;


@Service
public class OperationLogServiceImpl implements OperationLogService {

    @Autowired
    private OperationLogMapper operationLogMapper;



    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public void saveLog(String operation) {
        OperationLog log = new OperationLog();
        log.setOperation(operation);
        log.setTime(LocalDateTime.now());
        operationLogMapper.insert(log);
    }
}
