package com.gitant.sfdrecipeapp.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

/**
 * Created by Anton Dyakov on 20.12.2022
 */
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoryName;
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
