package org.example.springtestdemo.redistest;

import org.example.springtestdemo.service.thruserservice.UserService;
import org.example.springtestdemo.service.impl.redisimpl.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisService redisService;
    @Autowired
    private UserService userService;

    @Test
    public void testRedis() {
        // 存储数据
        String userDTO=userService.getUserById(1L).toString();
        //List<User> user=userService.listAllUsers();
        //redisService.setKeys("sys_user", user);
        redisService.setKey("sys_user2", userDTO);
       // System.out.println("性别："+userDTO.getGender().getValue());
        // 获取数据
        String sys_user = redisService.getKey("sys_user2");
        System.out.println("从 Redis 获取的值：" + sys_user); // 输出：RedisTest
        // 删除数据

    }
}
