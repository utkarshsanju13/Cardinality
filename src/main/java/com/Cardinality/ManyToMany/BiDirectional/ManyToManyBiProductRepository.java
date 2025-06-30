package com.Cardinality.ManyToMany.BiDirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManyToManyBiProductRepository extends JpaRepository<ManyToManyBiProduct, Integer> {
}
