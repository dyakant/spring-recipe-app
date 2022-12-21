package com.gitant.sfdrecipeapp.repositories;

import com.gitant.sfdrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anton Dyakov on 21.12.2022
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
