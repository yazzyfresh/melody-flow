package com.melodyflow.repository;

import com.melodyflow.entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VenueRepository extends JpaRepository<Venue, Long> {

    Optional<Venue> findByExternalId(String externalId);

    boolean existsByExternalId(String externalId);
}