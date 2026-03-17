package org.example.springtestdemo.controller.thrusercontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 必须加 @RestController，不能只写 @Controller
@RestController
public class TestController {

    // 直接用根路径，浏览器就能访问，零路径错误
    @GetMapping("/hello")
    public String testHello() {
        return "✅ SpringBoot Web 功能正常！";
    }
}