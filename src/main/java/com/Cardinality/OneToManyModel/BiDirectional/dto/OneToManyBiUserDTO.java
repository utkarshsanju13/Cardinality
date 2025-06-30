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
}
