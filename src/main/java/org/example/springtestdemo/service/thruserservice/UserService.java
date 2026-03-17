package org.example.springtestdemo.service.thruserservice;


import org.example.springtestdemo.entity.thruser.User;


import java.util.List;

/**
 * 用户服务层接口
 */
public interface UserService {
    /**
     * 根据ID查询用户
     */
    User getUserById(Long id);

    /**
     * 查询所有用户
     */
    List<User> listAllUsers();

    /**
     * 添加用户
     */
    boolean addUser(User user);

    /**
     * 更新用户
     */
    boolean updateUser(User user);

    /**
     * 删除用户
     */
    boolean deleteUser(Long id);


}