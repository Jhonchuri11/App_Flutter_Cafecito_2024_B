package com.cafecitodev.cafecitod.controller;


import com.cafecitodev.cafecitod.entity.Song;
import com.cafecitodev.cafecitod.service.SongService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@AllArgsConstructor
@RequestMapping("/api/cafecito/v1/songs")
@RestController
public class SongController {

    private final SongService songService;

    // Listar todos nuestras canciones
    @GetMapping
    public Iterable<Song> list() {
        return songService.findAll();
    }

    // Listar o traer solo una cancion por su id
    @GetMapping("{id}")
    public Song get(@PathVariable Integer id) {
        return songService.findById(id);
    }

    // Endpoint para crear nueva cancion
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Song create(@RequestBody Song song) {
        return songService.create(song);
    }

    // Endpoint para actualizar una cancion
    @PutMapping("{id}")
    public Song update(@PathVariable Integer id, @RequestBody Song form)
    {
        return songService.update(id, form);
    }

    // Endpoitn para eliminar una cancion
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        songService.delete(id);
    }



}
