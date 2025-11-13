package com.Cardinality.OneToManyModel.BiDirectional.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OneToManyBiOrderDTO {

    private int id;
    private String productName;
//    private OneToManyBiUserDTO user;


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
}
