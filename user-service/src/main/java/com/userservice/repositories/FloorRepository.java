package com.userservice.repositories;

import com.userservice.model.Floor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FloorRepository extends JpaRepository<Floor, Integer> {
}
