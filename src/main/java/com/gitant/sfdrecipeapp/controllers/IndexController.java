package com.gitant.sfdrecipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anton Dyakov on 15.12.2022
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        System.out.println("---- getIndexPage is triggered now. Yeap!");
        return "index";
    }
}
