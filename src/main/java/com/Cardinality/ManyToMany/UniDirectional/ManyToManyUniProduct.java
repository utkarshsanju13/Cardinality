package com.Cardinality.ManyToMany.UniDirectional;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "manyToManyUni_Product")
@Getter
@Setter
public class ManyToManyUniProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
}
