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
@Table(name = "STEPS")
public class StepsEntity extends AbstractEntity {
    @Column(name = "name", length = 50, nullable = false, unique = true)
    private String name;

    @ManyToOne
    private ProductTypeEntity entity;
}