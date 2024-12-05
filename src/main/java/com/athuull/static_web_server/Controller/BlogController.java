package com.athuull.static_web_server.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {

    @GetMapping("/posts/{blogName}/")
    public String redirectBlog(@PathVariable String blogName) {
        return "redirect:/posts/" + blogName + "/index.html";
    }
}
