package com.Cardinality.ManyToMany.UniDirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManyToManyUniProductRepository extends JpaRepository<ManyToManyUniProduct, Integer> {
}
