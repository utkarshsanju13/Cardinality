package com.Cardinality.OneToManyModel.UniDirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneToManyUniOrderRepository extends JpaRepository<OneToManyUniOrders, Integer> {
}
