package org.malinowsky.brewkit.brewkitdata.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "recipe")
public class RecipeEntity extends AbstractEntity {
    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    private AlcoholSubtypeEntity entity;

    @OneToMany(mappedBy = "recipe")
    private Collection<StepsEntity> steps;

    @OneToMany(mappedBy = "recipe")
    private Collection<IngredientsEntity> ingredients;
}
