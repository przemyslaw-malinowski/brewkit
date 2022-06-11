package org.malinowsky.brewkit.brewkitdata.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "alcohol_general_type")
public class AlcoholGeneralTypeEntity extends AbstractEntity{
    @Column(name = "name", length = 50, nullable = false, unique = true)
    private String name;

    @Column(name = "code", length = 50, nullable = false, unique = true)
    private String code;
}
