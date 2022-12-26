package com.gitant.sfdrecipeapp.services;

import com.gitant.sfdrecipeapp.domain.Recipe;

import java.util.Set;

/**
 * Created by Anton Dyakov on 26.12.2022
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
