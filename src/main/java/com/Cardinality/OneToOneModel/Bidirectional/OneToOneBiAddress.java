package com.Cardinality.OneToOneModel.Bidirectional;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "oneToOneBi_Address")
@Getter
@Setter
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class OneToOneBiAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String street;
    private String city;
    @OneToOne(mappedBy = "address")
//    @JsonBackReference
    private OneToOneBiUser user;
}
