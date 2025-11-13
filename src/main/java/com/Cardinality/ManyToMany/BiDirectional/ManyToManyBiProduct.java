package com.Cardinality.ManyToMany.BiDirectional;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "manyToManyBi_Product")
@Getter
@Setter
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "productId"
)
public class ManyToManyBiProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;

    @ManyToMany(mappedBy = "products")
    private List<ManyToManyBiOrder> orders = new ArrayList<>();

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<ManyToManyBiOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ManyToManyBiOrder> orders) {
        this.orders = orders;
    }
}
