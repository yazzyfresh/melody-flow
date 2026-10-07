package com.melodyflow.service;

import com.melodyflow.entity.Artist;
import com.melodyflow.repository.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> findAll() {
        return artistRepository.findAll();
    }

    public Optional<Artist> findById(Long id) {
        return artistRepository.findById(id);
    }

    public Optional<Artist> findByExternalId(String externalId) {
        return artistRepository.findByExternalId(externalId);
    }

    public Artist save(Artist artist) {
        return artistRepository.save(artist);
    }

    public void deleteById(Long id) {
        artistRepository.deleteById(id);
    }
}