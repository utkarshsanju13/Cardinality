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

}
