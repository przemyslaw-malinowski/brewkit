package org.malinowsky.brewkit.brewkitdata.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "recipe")
public class RecipeEntity extends AbstractEntity {
    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    private AlcoholGeneralSubtypeEntity entity;

    @OneToOne
    private ProductsMeasuresEntity products;
}
