package com.gitant.sfdrecipeapp.repositories;

import com.gitant.sfdrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anton Dyakov on 21.12.2022
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
