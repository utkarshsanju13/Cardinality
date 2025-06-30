package com.Cardinality.OneToManyModel.UniDirectional;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "oneToManyUni_User")
@Entity
@Getter
@Setter
public class OneToManyUniUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "user_id_fk",referencedColumnName = "userId")
    private List<OneToManyUniOrders> orders;

}
