package com.example.findjobproject.Controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class CategoryUIController {
    @RequestMapping
    fun mainCategoryUI() : String{
        return "mainCategory"
    }
}