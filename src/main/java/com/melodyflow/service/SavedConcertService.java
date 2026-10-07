package com.melodyflow.service;

import com.melodyflow.entity.SavedConcert;
import com.melodyflow.repository.SavedConcertRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SavedConcertService {

    private final SavedConcertRepository savedConcertRepository;

    public SavedConcertService(SavedConcertRepository savedConcertRepository) {
        this.savedConcertRepository = savedConcertRepository;
    }

    public List<SavedConcert> findAll() {
        return savedConcertRepository.findAll();
    }

    public Optional<SavedConcert> findById(Long id) {
        return savedConcertRepository.findById(id);
    }

    public List<SavedConcert> findByUserId(Long userId) {
        return savedConcertRepository.findByUserId(userId);
    }

    public Optional<SavedConcert> findByUserIdAndConcertId(Long userId, Long concertId) {
        return savedConcertRepository.findByUserIdAndConcertId(userId, concertId);
    }

    public boolean existsByUserIdAndConcertId(Long userId, Long concertId) {
        return savedConcertRepository.existsByUserIdAndConcertId(userId, concertId);
    }

    public SavedConcert save(SavedConcert savedConcert) {
        return savedConcertRepository.save(savedConcert);
    }

    public void deleteById(Long id) {
        savedConcertRepository.deleteById(id);
    }
}