package com.Cardinality.ManyToMany.UniDirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ManyToManyUniController {

    @Autowired
    private ManyToManyUniOrderRepository orderRepository;

    @Autowired
    private ManyToManyUniProductRepository productRepository;

    @PostMapping("/manyToManyUni/addOrder")
    public ManyToManyUniOrder addOrder(@RequestBody ManyToManyUniOrder order) {
        return orderRepository.save(order);
    }

    @GetMapping("/manyToManyUni/getOrder/{id}")
    public ManyToManyUniOrder getOrderById(@PathVariable int id) {
        return orderRepository.findById(id).get();
    }
}
