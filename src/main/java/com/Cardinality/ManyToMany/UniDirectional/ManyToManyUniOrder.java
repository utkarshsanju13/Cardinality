package com.Cardinality.ManyToMany.UniDirectional;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "manyToManyUni_Order")
@Getter
@Setter
public class ManyToManyUniOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private int id;
    private Long orderNumber;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "many_to_many_uni_order_product",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "productId")
    )
    private List<ManyToManyUniProduct> products = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<ManyToManyUniProduct> getProducts() {
        return products;
    }

    public void setProducts(List<ManyToManyUniProduct> products) {
        this.products = products;
    }
}
