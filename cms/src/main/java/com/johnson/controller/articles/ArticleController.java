package com.johnson.controller.articles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/article")
@Controller
public class ArticleController {

    @GetMapping()
    public String index() {
        return "articles/article";
    }

}
