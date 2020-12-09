package com.johnson.controller.articles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/article_category")
@Controller
public class ArticleCategoryController {

    @GetMapping()
    public String index() {
        return "articles/article_category";
    }

}
