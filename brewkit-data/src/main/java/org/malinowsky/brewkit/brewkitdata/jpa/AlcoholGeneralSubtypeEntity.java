package org.malinowsky.brewkit.brewkitdata.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "alcohol_general_subtype")
public class AlcoholGeneralSubtypeEntity extends AbstractEntity{
    @Column(name = "name", length = 50, nullable = false, unique = true)
    private String name;

    @Column(name = "code", length = 50, nullable = false, unique = true)
    private String code;

    @ManyToOne
    private AlcoholGeneralSubtypeEntity alcoholGeneralSubtypeEntity;
}
