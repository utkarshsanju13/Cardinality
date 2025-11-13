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

    public ManyToOneUniUser getUser() {
        return user;
    }

    public void setUser(ManyToOneUniUser user) {
        this.user = user;
    }
}
