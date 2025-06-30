package com.Cardinality.OneToOneModel.Unidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="oneTooneUni_address")
@Getter
@Setter
public class OneToOneUniAddress {

    @Id
    private int id;
    private String street;
    private String city;
    private String state;

}
