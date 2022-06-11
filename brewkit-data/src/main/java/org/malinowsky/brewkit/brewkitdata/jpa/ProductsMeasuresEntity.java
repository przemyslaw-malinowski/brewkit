package org.malinowsky.brewkit.brewkitdata.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "product_measures")
public class ProductsMeasuresEntity extends AbstractEntity {
    @ManyToOne
    private ProductEntity productEntity;

    @ManyToOne
    private MeasuresRecipe measuresRecipe;

    @Column(nullable = false, name = "quantity")
    private Integer quantity;
}
