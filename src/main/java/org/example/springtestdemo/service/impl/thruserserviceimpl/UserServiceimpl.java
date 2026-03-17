package org.example.springtestdemo.service.impl.thruserserviceimpl;

import org.example.springtestdemo.config.BusinessException;
import org.example.springtestdemo.entity.thruser.User;
import org.example.springtestdemo.entity.thruser.UserPoint;
import org.example.springtestdemo.mapper.thrusermapper.THrEmpUserMapper;
import org.example.springtestdemo.mapper.thrusermapper.UserPointMapper;
import org.example.springtestdemo.service.thruserservice.OperationLogService;
import org.example.springtestdemo.service.thruserservice.UserService;
import org.example.springtestdemo.untiy.TransactionLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private THrEmpUserMapper thrEmpUserMapper;
    @Autowired
    private UserPointMapper userPointMapper;
    @Autowired
    private OperationLogService operationLogService;


    // ✅ 核心事务：多步写操作，必须保证一致性
    @Transactional(rollbackFor = Exception.class)
    @TransactionLog(successMsg = "用户注册成功：", failMsg = "用户注册失败：")
    public void registerUser(User user) {
        // 检查用户是否已存在
        if (userExists(user.getName())) {
            throw new BusinessException(400, "用户名已存在");
        }
        // 参数校验
        if (user.getName() == null || user.getName().isEmpty()) {
            throw new BusinessException(400, "用户名不能为空");
        }
        // 1. 保存用户（第一步写操作）
        thrEmpUserMapper.insert(user);
        // 2. 赠送新用户 100 积分（第二步写操作）
        UserPoint point = new UserPoint();
        point.setUserId(user.getId());
        point.setPoint(100);
        userPointMapper.insert(point);

    }

    @Override
    public User getUserById(Long id) {
        return thrEmpUserMapper.selectById(id);
    }


    @Override
    public List<User> listAllUsers() {
        return thrEmpUserMapper.listAllUsers();
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(Long id) {

        return false;
    }
    @Override
    public String test(){
        return thrEmpUserMapper.test();
    }


    private boolean userExists(String name) {
        // 实现用户存在性检查
        return false;
    }
}
