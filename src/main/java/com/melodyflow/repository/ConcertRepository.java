package com.melodyflow.repository;

import com.melodyflow.entity.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConcertRepository extends JpaRepository<Concert, Long> {

    Optional<Concert> findByExternalId(String externalId);

    boolean existsByExternalId(String externalId);
}