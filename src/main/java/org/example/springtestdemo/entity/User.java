package org.example.springtestdemo.entity;

import lombok.Data;

/**
 * 用户实体类（对应数据库user表）
 */
@Data  // Lombok注解：自动生成get/set/toString/构造方法等
public class User {
    // 主键ID
    private Long id;
    // 用户名
    private String username;
    // 密码（实际开发需加密）
    private String password;
    // 年龄
    private Integer age;
    // 邮箱
    private String email;
}