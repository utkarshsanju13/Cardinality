package com.Cardinality.ManyToOneModel.UniDirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ManyToOneUniController {

    @Autowired
    private ManyToOneUniUserRepository userRepository;

    @Autowired
    private ManyToOneUniOrderRepository orderRepository;

    @PostMapping("/manyToOneUni/addUser")
    public ManyToOneUniUser addUser(@RequestBody ManyToOneUniUser user) {
        return userRepository.save(user);
    }

    @GetMapping("manyToOneUni/getUser/{id}")
    public ManyToOneUniUser getUserById(@PathVariable int id) {
        return userRepository.findById(id).get();
    }

    @PostMapping("/manyToOneUni/addOrder")
    public ManyToOneUniOrder addOrder(@RequestBody ManyToOneUniOrder order) {
        return orderRepository.save(order);
    }

    @GetMapping("/manyToOneUni/getOrder/{id}")
    public ManyToOneUniOrder getOrderById(@PathVariable int id) {
        return orderRepository.findById(id).get();
    }
}
