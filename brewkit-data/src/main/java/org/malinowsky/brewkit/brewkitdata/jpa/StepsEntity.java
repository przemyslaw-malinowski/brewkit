package org.malinowsky.brewkit.brewkitdata.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "recipe_steps")
public class StepsEntity extends AbstractEntity {
    @Column(name = "name", length = 50, nullable = false, unique = true)
    private String name;

    @Column(name = "description", length = 5000, nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private RecipeEntity recipe;
}