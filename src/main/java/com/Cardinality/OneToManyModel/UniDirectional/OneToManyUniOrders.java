package com.Cardinality.OneToManyModel.UniDirectional;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "oneToManyUni_Orders")
@Entity
@Getter
@Setter
public class OneToManyUniOrders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String productName;

}
