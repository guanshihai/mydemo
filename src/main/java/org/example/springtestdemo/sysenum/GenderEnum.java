package org.example.springtestdemo.sysenum;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum GenderEnum {
    MALE("男"),
    FEMALE("女"),
    UNKNOWN("未知");

    // @EnumValue 标记：该字段对应数据库中的枚举值
    @EnumValue
    private final String value;

    // 构造方法
    GenderEnum(String value) {
        this.value = value;
    }

    public static String getGender(String gender) {
        if (gender == null || gender.isEmpty()){
            return UNKNOWN.value;
        }
        return switch (gender) {
            case "1" -> MALE.value;
            case "2" -> FEMALE.value;
            default -> UNKNOWN.value;
        };
    }
}
