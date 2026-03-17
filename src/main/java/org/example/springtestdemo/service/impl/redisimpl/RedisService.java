package org.example.springtestdemo.service.impl.redisimpl;

import org.example.springtestdemo.entity.thruser.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class RedisService {
    // 注入 Redis 模板（String 类型）
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    // 存储 String 类型数据
    public void setKey(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }
    public void setKeys(String key, List<User> value) {
        stringRedisTemplate.opsForValue().set(key, String.valueOf(value));
    }

    // 获取 String 类型数据
    public String getKey(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    // 删除 Key
    public void deleteKey(String key) {
        stringRedisTemplate.delete(key);
    }
}
