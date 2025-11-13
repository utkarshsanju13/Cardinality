package com.Cardinality.OneToOneModel.Bidirectional;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "oneToOneBi_User")
@Getter
@Setter
//Tells Jackson: track objects by an identifier (usually id).
//When serializing, if Jackson encounters the same object again, it won’t serialize it fully, just reference its id.
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class OneToOneBiUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "addressId")
//    @JsonManagedReference
    private OneToOneBiAddress address;

//    @JsonManagedReference: the forward (parent → child) part.
//    @JsonBackReference: the back (child → parent) part → ignored during serialization.
}
