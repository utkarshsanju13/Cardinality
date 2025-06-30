package com.Cardinality.OneToOneModel.Unidirectional;

import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneToOneUniAddressRepository extends JpaRepository<OneToOneUniAddress, Integer> {
}
