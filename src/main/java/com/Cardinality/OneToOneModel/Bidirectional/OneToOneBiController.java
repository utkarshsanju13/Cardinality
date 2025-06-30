package com.Cardinality.OneToOneModel.Bidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OneToOneBiController {

    @Autowired
    private OneToOneBiUserRepository userRepository;

    @Autowired
    private OneToOneBiAddressRepository addressRepository;

    @PostMapping("/oneToOneBi/adduser")
    public OneToOneBiUser addUser(@RequestBody OneToOneBiUser user) {
        return userRepository.save(user);
    }

    @GetMapping("/oneToOneBi/getUser/{id}")
    public OneToOneBiUser getUserById(@PathVariable  int id) {
        return userRepository.findById(id).get();
    }

    @GetMapping("/oneToOneBi/getAddress/{id}")
    public OneToOneBiAddress getAddressById(@PathVariable  int id) {
        return addressRepository.findById(id).get();
    }
}
