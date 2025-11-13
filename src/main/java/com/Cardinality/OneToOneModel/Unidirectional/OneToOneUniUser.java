package com.Cardinality.OneToOneModel.Unidirectional;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "oneToOneUni_User")
@Getter
@Setter
public class OneToOneUniUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name= "address_id", referencedColumnName = "id")
//    private OneToOneUniAddress address;

}
