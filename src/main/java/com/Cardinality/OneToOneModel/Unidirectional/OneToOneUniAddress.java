package com.Cardinality.OneToOneModel.Unidirectional;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="oneToOneUni_address")
@Getter
@Setter
public class OneToOneUniAddress {

    @Id
    private int id;
    private String street;
    private String city;
    private String state;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fk_id", referencedColumnName = "id")
    private OneToOneUniUser userId;

}
