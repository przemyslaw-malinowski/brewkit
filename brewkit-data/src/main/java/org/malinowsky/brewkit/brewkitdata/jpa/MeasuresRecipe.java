package org.malinowsky.brewkit.brewkitdata.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "measurements")
public class MeasuresRecipe extends AbstractEntity{
    @Column(name = "name", length = 50, nullable = false, unique = true)
    private String name;

    @Column(name = "short", length = 50, nullable = false, unique = true)
    private String shortName;
}
