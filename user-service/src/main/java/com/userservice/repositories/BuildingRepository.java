package com.userservice.repositories;

import com.userservice.model.Buiding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BuildingRepository extends JpaRepository<Buiding, Integer> {
}
