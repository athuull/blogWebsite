package com.athuull.static_web_server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/about").setViewName("redirect:/about/");
        registry.addViewController("/about/").setViewName("forward:/about/index.html");
        registry.addViewController("/posts").setViewName("redirect:/posts/");
        registry.addViewController("/posts/").setViewName("forward:/posts/index.html");

    }
}