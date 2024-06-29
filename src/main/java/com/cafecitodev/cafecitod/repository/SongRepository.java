package com.cafecitodev.cafecitod.repository;

import com.cafecitodev.cafecitod.entity.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Integer> {

}
