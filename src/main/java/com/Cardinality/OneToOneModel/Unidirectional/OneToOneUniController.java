package com.Cardinality.OneToOneModel.Unidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OneToOneUniController {

    @Autowired
    private OneToOneUniUserRepository   userRepository;

    @PostMapping("/oneToOneUni/adduser")
    public OneToOneUniUser addUser(@RequestBody OneToOneUniUser user) {
        return userRepository.save(user);
    }

    @GetMapping("/oneToOneUni/getUser/{id}")
    public OneToOneUniUser getUser(@PathVariable int id) {
        return userRepository.findById(id).get();
    }
}
