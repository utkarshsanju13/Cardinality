package com.Cardinality.OneToManyModel.BiDirectional;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "oneToManyBi_Orders")
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "id"
//)
public class OneToManyBiOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productName;

    @ManyToOne
    @JoinColumn(name = "user_id_fk", referencedColumnName = "userid")
    @JsonBackReference
    private OneToManyBiUser user;

    // we can't use mappedBy at owning side -> is the side that owns foreign key
    // mappedby used is in inverse side (user side in case of bidirectional maping)
    //That's why above code is correct
//    @ManyToOne(mappedBy)
//    private OneToManyBiUser user;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public OneToManyBiUser getUser() {
        return user;
    }

    public void setUser(OneToManyBiUser user) {
        this.user = user;
    }
}
