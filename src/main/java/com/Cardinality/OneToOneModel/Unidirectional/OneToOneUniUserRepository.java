package com.Cardinality.OneToOneModel.Unidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneToOneUniUserRepository extends JpaRepository<OneToOneUniUser, Integer> {

}
