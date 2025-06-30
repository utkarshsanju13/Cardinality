package com.Cardinality.ManyToOneModel.UniDirectional;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ManyToOneUni_User")
public class ManyToOneUniUser  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
}
