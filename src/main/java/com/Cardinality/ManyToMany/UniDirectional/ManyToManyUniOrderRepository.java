package com.Cardinality.ManyToMany.UniDirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManyToManyUniOrderRepository extends JpaRepository<ManyToManyUniOrder, Integer> {
}
