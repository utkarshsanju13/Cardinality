package com.Cardinality.OneToManyModel.BiDirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneToManyBiOrderRepository extends JpaRepository<OneToManyBiOrder, Integer> {
}
