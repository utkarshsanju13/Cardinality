package com.Cardinality.OneToManyModel.BiDirectional.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OneToManyBiUserDTO {

    private int id;
    private String name;
    private List<OneToManyBiOrderDTO> orders;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OneToManyBiOrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OneToManyBiOrderDTO> orders) {
        this.orders = orders;
    }
}
