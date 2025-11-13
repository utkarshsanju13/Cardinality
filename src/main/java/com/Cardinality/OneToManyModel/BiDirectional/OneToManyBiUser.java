package com.Cardinality.OneToManyModel.BiDirectional;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name="oneToManyBi_User")
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "userid"
//)
public class OneToManyBiUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;
    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<OneToManyBiOrder> orders;

    //This below code is valid only when you have unidirectional -> order class me userId attribute nhi hona chahiye
    //when we are doing bidirectional -> then user is inverse side -> use mappedby
    //and order is owning side -> owns foreign key-> use @JoinColumn

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id_fk", referencedColumnName = "userid")
//    private List<OneToManyBiOrder> orders;

    //this modification in set order is done because while creating user and listOfOrder in user.
    //this inverse relationship will not set (every order has useriD assocaited with it)
    //this we need to set in setter of order (looped all order and set userId in each)
    public void setOrders(List<OneToManyBiOrder> orders) {
        this.orders = orders;
        for (OneToManyBiOrder order : orders) {
            order.setUser(this);
        }
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OneToManyBiOrder> getOrders() {
        return orders;
    }
}
