package com.melodyflow.repository;

import com.melodyflow.entity.ConcertPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConcertPlanRepository extends JpaRepository<ConcertPlan, Long> {

    Optional<ConcertPlan> findBySavedConcertId(Long savedConcertId);
}