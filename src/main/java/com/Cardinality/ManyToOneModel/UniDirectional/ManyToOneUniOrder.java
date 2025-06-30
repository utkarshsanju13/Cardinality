package com.Cardinality.ManyToOneModel.UniDirectional;

import com.Cardinality.OneToManyModel.UniDirectional.OneToManyUniUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ManyToOneUni_Order")
public class ManyToOneUniOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productName;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id_fk", referencedColumnName = "userId")
    private ManyToOneUniUser user;




}
