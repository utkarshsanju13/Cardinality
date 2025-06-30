package com.Cardinality.ManyToOneModel.UniDirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManyToOneUniOrderRepository extends JpaRepository<ManyToOneUniOrder, Integer> {
}
