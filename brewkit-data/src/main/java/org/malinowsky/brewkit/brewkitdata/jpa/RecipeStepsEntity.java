package org.malinowsky.brewkit.brewkitdata.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "recipe_steps")
public class RecipeStepsEntity extends AbstractEntity {
    @OneToOne
    private RecipeEntity recipeEntity;

    @OneToMany
    private List<StepsEntity> steps;
}
