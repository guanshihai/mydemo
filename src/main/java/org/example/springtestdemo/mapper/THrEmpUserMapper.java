package org.example.springtestdemo.mapper;


import org.example.springtestdemo.entity.User;

import java.util.List;


public interface THrEmpUserMapper {
    /**
     * 获取所有用户
     * @return
     */
    public List<User> listAllUsers();

    /**
     *  通过id获取用户
     * @param id
     * @return
     */
    public User  getUserById(Long id);

    /**
     *  添加用户
     * @param user
     * @return
     */
    public int addUser(User user);
}
