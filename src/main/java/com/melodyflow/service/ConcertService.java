package com.melodyflow.service;

import com.melodyflow.entity.Concert;
import com.melodyflow.repository.ConcertRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConcertService {

    private final ConcertRepository concertRepository;

    public ConcertService(ConcertRepository concertRepository) {
        this.concertRepository = concertRepository;
    }

    public List<Concert> findAll() {
        return concertRepository.findAll();
    }

    public Optional<Concert> findById(Long id) {
        return concertRepository.findById(id);
    }

    public Optional<Concert> findByExternalId(String externalId) {
        return concertRepository.findByExternalId(externalId);
    }

    public Concert save(Concert concert) {
        return concertRepository.save(concert);
    }

    public void deleteById(Long id) {
        concertRepository.deleteById(id);
    }
}