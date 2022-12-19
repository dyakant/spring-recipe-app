package com.gitant.sfdrecipeapp.domain;

import jakarta.persistence.*;

/**
 * Created by Anton Dyakov on 20.12.2022
 */
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uom;
    @OneToOne
    private Ingredient ingredient;

    public Long getId() {
        return id;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
