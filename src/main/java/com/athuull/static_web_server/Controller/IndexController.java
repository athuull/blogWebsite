package com.athuull.static_web_server.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/{path:[^\\.]*}") // Matches everything except paths with a dot (e.g., .js, .css)
    public String forward() {
        return "forward:/index.html";
    }
}
