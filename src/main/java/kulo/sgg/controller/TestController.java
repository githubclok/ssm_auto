package kulo.controller;

import kulo.sgg.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    private AppConfig appConfig;

    @Autowired
    public TestController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @RequestMapping("/test")
    public String test() {
        System.out.println("request test");
        String path = appConfig.getDefaultPath();
        System.out.println(path);
        return path;
    }
}
