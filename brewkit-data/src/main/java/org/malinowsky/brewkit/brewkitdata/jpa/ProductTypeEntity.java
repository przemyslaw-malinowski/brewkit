package org.malinowsky.brewkit.brewkitdata.jpa;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_type")
public class ProductTypeEntity extends AbstractEntity {
    @Column(name = "code", length = 50)
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "user_id")
    private Integer userId;
}