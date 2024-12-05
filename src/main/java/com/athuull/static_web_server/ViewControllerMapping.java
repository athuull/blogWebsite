package com.athuull.static_web_server;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class ViewControllerMapping implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/about").setViewName("redirect:/about");
        registry.addViewController("/about").setViewName("redirect:/about/index.html");

    }
}
