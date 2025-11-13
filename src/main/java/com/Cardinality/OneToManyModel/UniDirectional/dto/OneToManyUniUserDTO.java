package com.Cardinality.OneToManyModel.UniDirectional.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OneToManyUniUserDTO {

//    private int id;
    private String name;
    private List<OneToManyUniOrderDTO> orders;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OneToManyUniOrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OneToManyUniOrderDTO> orders) {
        this.orders = orders;
    }
}
