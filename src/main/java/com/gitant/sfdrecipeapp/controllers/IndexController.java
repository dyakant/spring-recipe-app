package com.gitant.sfdrecipeapp.controllers;

import com.gitant.sfdrecipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anton Dyakov on 15.12.2022
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("get Index page");
        model.addAttribute("recipes", recipeService.getRecipes());
        log.debug(model.toString());
        return "index";

    }
}
