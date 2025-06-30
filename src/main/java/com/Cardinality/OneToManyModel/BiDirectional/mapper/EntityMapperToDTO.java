package com.Cardinality.OneToManyModel.BiDirectional.mapper;

import com.Cardinality.OneToManyModel.BiDirectional.OneToManyBiOrder;
import com.Cardinality.OneToManyModel.BiDirectional.OneToManyBiUser;
import com.Cardinality.OneToManyModel.BiDirectional.dto.OneToManyBiOrderDTO;
import com.Cardinality.OneToManyModel.BiDirectional.dto.OneToManyBiUserDTO;

import java.util.ArrayList;
import java.util.List;

public class EntityMapperToDTO {

    public static OneToManyBiUserDTO entityToDTO(OneToManyBiUser entity) {
        OneToManyBiUserDTO dto = new OneToManyBiUserDTO();
        dto.setId(entity.getUserid());
        dto.setName(entity.getName());

        List<OneToManyBiOrderDTO> orders = new ArrayList<>();
        for(OneToManyBiOrder order : entity.getOrders()) {
            orders.add(entityToDTO(order));
        }
        dto.setOrders(orders);
        return dto;
    }

    public static OneToManyBiOrderDTO entityToDTO(OneToManyBiOrder entity) {
        OneToManyBiOrderDTO dto = new OneToManyBiOrderDTO();
        dto.setId(entity.getId());
        dto.setProductName(entity.getProductName());

        return dto;
    }
}
