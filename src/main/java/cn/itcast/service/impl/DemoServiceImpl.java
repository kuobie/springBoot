package cn.itcast.service.impl;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{
    public void outputResult() {
        System.out.println("从组合注解配置照样获得的bean");
    }
}
