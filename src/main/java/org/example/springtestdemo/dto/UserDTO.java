package org.example.springtestdemo.dto;

import lombok.Data;

/**
 * 用户DTO（前端交互用，不含密码等敏感字段）
 */
@Data // Lombok注解：自动生成get/set/toString/构造方法等
public class UserDTO {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}