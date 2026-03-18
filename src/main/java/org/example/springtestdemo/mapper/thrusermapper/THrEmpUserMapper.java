package org.example.springtestdemo.mapper.thrusermapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.example.springtestdemo.entity.thruser.User;

import java.util.List;


public interface THrEmpUserMapper extends BaseMapper<User> {
    /**
     * 获取所有用户
     * @return
     */
     List<User> listAllUsers();

    /**
     *  通过id获取用户
     * @param id
     * @return
     */
    //@Select("select id, name, age, email from sys_user where id=#{id}")
     User getUserById(Long id);

     /**
     *  通过用户名获取用户
     * @param name
     * @return
     */
      User getUserByName(String name);

     /**
     *  更新用户
     * @param user
     * @return
     */
     int updateUser(User user);

    /**
     *  添加用户
     * @param user
     * @return
     */
     int addUser(User user);


}
