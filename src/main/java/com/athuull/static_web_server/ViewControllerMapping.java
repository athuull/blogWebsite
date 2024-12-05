//package com.athuull.static_web_server;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class ViewControllerMapping implements WebMvcConfigurer {
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        // Forward /about to /about/index.html
//        registry.addViewController("/about").setViewName("forward:/about/index.html");
//        registry.addViewController("/posts").setViewName("forward:/posts/index.html");
//    }
//}
