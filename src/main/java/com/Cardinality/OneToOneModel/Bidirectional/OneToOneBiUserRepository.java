package com.Cardinality.OneToOneModel.Bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneToOneBiUserRepository extends JpaRepository<OneToOneBiUser, Integer> {
}
