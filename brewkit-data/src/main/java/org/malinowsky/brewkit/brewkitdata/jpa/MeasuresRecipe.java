package org.malinowsky.brewkit.brewkitdata.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "measurements")
@NamedQuery(name = MeasuresRecipe.GET_ALL, query = "select m from MeasuresRecipe m")
public class MeasuresRecipe extends AbstractEntity{
    public static final String GET_ALL = "GET_ALL";
    @Column(name = "name", length = 50, nullable = false, unique = true)
    private String name;

    @Column(name = "short", length = 50, nullable = false, unique = true)
    private String shortName;
}
