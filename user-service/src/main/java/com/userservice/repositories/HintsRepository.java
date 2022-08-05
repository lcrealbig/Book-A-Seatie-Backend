package com.userservice.repositories;

import com.userservice.model.Hints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface HintsRepository extends JpaRepository<Hints, Integer> {
}
