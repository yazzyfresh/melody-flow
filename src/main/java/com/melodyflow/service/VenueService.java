package com.melodyflow.service;

import com.melodyflow.entity.Venue;
import com.melodyflow.repository.VenueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VenueService {

    private final VenueRepository venueRepository;

    public VenueService(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    public List<Venue> findAll() {
        return venueRepository.findAll();
    }

    public Optional<Venue> findById(Long id) {
        return venueRepository.findById(id);
    }

    public Optional<Venue> findByExternalId(String externalId) {
        return venueRepository.findByExternalId(externalId);
    }

    public Venue save(Venue venue) {
        return venueRepository.save(venue);
    }

    public void deleteById(Long id) {
        venueRepository.deleteById(id);
    }
}