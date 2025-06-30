package com.Cardinality.OneToManyModel.UniDirectional;

import com.Cardinality.OneToManyModel.UniDirectional.dto.OneToManyUniUserDTO;
import com.Cardinality.OneToManyModel.UniDirectional.mapper.EntityToDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OneToManyUniController {

    @Autowired
    private OneToManyUniUserRepository userRepository;

    @Autowired
    private OneToManyUniOrderRepository orderRepository;

    @PostMapping("/oneToManyUni/addUser")
    public OneToManyUniUser addUser(@RequestBody OneToManyUniUser user) {
        return userRepository.save(user);
    }

    @GetMapping("/oneToManyUni/getUser/{id}")
    public OneToManyUniUserDTO getUser(@PathVariable int id) {
        return EntityToDtoMapper.entityToDto(userRepository.findById(id).get());
    }

    @GetMapping("/oneToManyUni/getOrders/{id}")
    public OneToManyUniOrders getOrders(@PathVariable int id) {
        return orderRepository.findById(id).get();
    }

    @GetMapping("/oneToManyUni/orphanTest/{id}")
    public OneToManyUniUserDTO testOrphan(@PathVariable  int id) {
        OneToManyUniUser user = userRepository.findById(id).get();
        user.getOrders().remove(user.getOrders().size()-1);
        return EntityToDtoMapper.entityToDto(userRepository.save(user));
    }

}
