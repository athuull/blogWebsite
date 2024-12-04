package com.athuull.static_web_server.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Value("${APP_NAME:default-app}")
    private String appName;

    @GetMapping("/")
    public String serveIndex() {
        System.out.println("Request is served by" + appName);
        return "index.html";
    }


}
