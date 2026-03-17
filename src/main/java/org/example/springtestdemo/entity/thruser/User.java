package org.example.springtestdemo.entity.thruser;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;




/**
 * 用户实体类（对应数据库 user 表）
 */
@Data  // Lombok 注解：自动生成 get/set/toString/构造方法等
@TableName("sys_user")
public class User {
    // 主键ID
    private Long id;
    // 用户名
    private String name;
    // 密码（实际开发需加密）
    private String password;
    // 年龄
    private Integer age;
    // 邮箱
    private String email;

    private String gender;
}