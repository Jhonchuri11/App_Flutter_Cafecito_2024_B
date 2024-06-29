package com.cafecitodev.cafecitod.service;

import com.cafecitodev.cafecitod.entity.Song;
import com.cafecitodev.cafecitod.repository.SongRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class SongService {


    private  final SongRepository songRepository;

    public Iterable<Song> findAll() {
        return songRepository.findAll();
    }

    public Song findById(Integer id) {
        return songRepository.findById(id).orElse(null);
    }

    public Song create(Song song) {
        song.setCreatedAt(LocalDateTime.now());
        return songRepository.save(song);
    }

    public Song update(Integer id, Song form) {

        Song song1FromDB = findById(id);

        song1FromDB.setTitle(form.getTitle());
        song1FromDB.setDescription(form.getDescription());
        song1FromDB.setImage(form.getImage());
        song1FromDB.setAuthor(form.getAuthor());

        return songRepository.save(song1FromDB);
    }

    public void delete(Integer id) {

        Song song1FromDB = findById(id);

        songRepository.delete(song1FromDB);
    }


}
