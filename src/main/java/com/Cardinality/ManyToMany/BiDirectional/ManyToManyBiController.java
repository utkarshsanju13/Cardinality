package com.Cardinality.ManyToMany.BiDirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ManyToManyBiController {

    @Autowired
    private ManyToManyBiProductRepository productRepository;

    @Autowired
    private ManyToManyBiOrderRepository orderRepository;

    @PostMapping("/manyToManyBi/addOrder")
    public ManyToManyBiOrder addOrder(@RequestBody ManyToManyBiOrder order) {
        List<ManyToManyBiProduct> products = order.getProducts().stream()
                .map(product -> productRepository.findById(product.getProductId()).get())
                .collect(Collectors.toList());

        order.setProducts(products);
        return orderRepository.save(order);
    }

    @GetMapping("/manyToManyBi/getOrder/{id}")
    public ManyToManyBiOrder getOrderById(@PathVariable int id) {
        return orderRepository.findById(id).get();
    }

    @PostMapping("/manyToManyBi/addProduct")
    public ManyToManyBiProduct addProduct(@RequestBody ManyToManyBiProduct product) {
        return productRepository.save(product);
    }

}
