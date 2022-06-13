package org.malinowsky.brewkit.brewkitdata.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "recipe_ingredients")
public class IngredientsEntity extends AbstractEntity {
    @ManyToOne
    private ProductsEntity productEntity;

    @ManyToOne
    private MeasuresRecipe measuresRecipe;

    @Column(nullable = false, name = "quantity")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private RecipeEntity recipe;
}
