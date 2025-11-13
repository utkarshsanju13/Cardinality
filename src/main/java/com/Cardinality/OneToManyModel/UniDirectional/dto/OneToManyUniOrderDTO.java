package com.Cardinality.OneToManyModel.UniDirectional.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OneToManyUniOrderDTO {

    private int id;
    private String productName;

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
