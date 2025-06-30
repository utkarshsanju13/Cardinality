package com.Cardinality.OneToManyModel.UniDirectional.mapper;

import com.Cardinality.OneToManyModel.BiDirectional.dto.OneToManyBiUserDTO;
import com.Cardinality.OneToManyModel.UniDirectional.OneToManyUniOrders;
import com.Cardinality.OneToManyModel.UniDirectional.OneToManyUniUser;
import com.Cardinality.OneToManyModel.UniDirectional.dto.OneToManyUniOrderDTO;
import com.Cardinality.OneToManyModel.UniDirectional.dto.OneToManyUniUserDTO;

import java.util.ArrayList;
import java.util.List;

public class EntityToDtoMapper {

    public static OneToManyUniUserDTO entityToDto(OneToManyUniUser oneToManyUniUser) {
        OneToManyUniUserDTO oneToManyUniUserDto = new OneToManyUniUserDTO();
//        oneToManyUniUserDto.setId(oneToManyUniUser.getId());
        oneToManyUniUserDto.setName(oneToManyUniUser.getName());

        List<OneToManyUniOrderDTO> oneToManyUniOrdersdto = new ArrayList<>();
        for(OneToManyUniOrders orders : oneToManyUniUser.getOrders()) {
            oneToManyUniOrdersdto.add(entityToDto(orders));
        }
        oneToManyUniUserDto.setOrders(oneToManyUniOrdersdto);
        return oneToManyUniUserDto;
    }

    public static OneToManyUniOrderDTO entityToDto(OneToManyUniOrders oneToManyUniOrders) {
        OneToManyUniOrderDTO oneToManyUniOrdersDto = new OneToManyUniOrderDTO();
        oneToManyUniOrdersDto.setId(oneToManyUniOrders.getId());
        oneToManyUniOrdersDto.setProductName(oneToManyUniOrders.getProductName());

        return oneToManyUniOrdersDto;
    }
}
