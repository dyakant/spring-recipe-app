package com.gitant.sfdrecipeapp.controllers;

import com.gitant.sfdrecipeapp.domain.Category;
import com.gitant.sfdrecipeapp.repositories.CategoryRepository;
import com.gitant.sfdrecipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by Anton Dyakov on 15.12.2022
 */
@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }


    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepository.findByCategoryName("American");
        categoryOptional.ifPresent(category -> System.out.println(category.getId()));
        return "index";

    }
}
