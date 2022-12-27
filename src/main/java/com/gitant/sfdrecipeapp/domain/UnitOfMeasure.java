package com.gitant.sfdrecipeapp.domain;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Created by Anton Dyakov on 20.12.2022
 */
@Data
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uom;
    @OneToOne
    private Ingredient ingredient;

}
