package org.example.springtestdemo.entity.thruser;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user_point")
public class UserPoint {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long userId;       // 用户ID
    private Integer point;     // 积分
}