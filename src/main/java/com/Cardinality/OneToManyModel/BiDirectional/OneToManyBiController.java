package com.Cardinality.OneToManyModel.BiDirectional;

import com.Cardinality.OneToManyModel.BiDirectional.dto.OneToManyBiUserDTO;
import com.Cardinality.OneToManyModel.BiDirectional.mapper.EntityMapperToDTO;
import com.Cardinality.OneToManyModel.UniDirectional.mapper.EntityToDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OneToManyBiController {

    @Autowired
    private OneToManyBiUserRepository userRepository;

    @Autowired
    private OneToManyBiOrderRepository orderRepository;

    @PostMapping("/oneToManyBi/addUser")
    public OneToManyBiUserDTO addUser(@RequestBody OneToManyBiUser user){
        return EntityMapperToDTO.entityToDTO(userRepository.save(user));
    }

    @GetMapping("/oneToManyBi/getUser/{id}")
    public OneToManyBiUserDTO getUser(@PathVariable Integer id) {
        return EntityMapperToDTO.entityToDTO(userRepository.findById(id).get());
    }

    @GetMapping("/oneToManyBi/getOrders/{id}")
    public OneToManyBiOrder getOrder(@PathVariable Integer id) {
        return orderRepository.findById(id).get();
    }


}
