package com.melodyflow.repository;

import com.melodyflow.entity.SavedConcert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SavedConcertRepository extends JpaRepository<SavedConcert, Long> {

    List<SavedConcert> findByUserId(Long userId);

    Optional<SavedConcert> findByUserIdAndConcertId(Long userId, Long concertId);

    boolean existsByUserIdAndConcertId(Long userId, Long concertId);
}