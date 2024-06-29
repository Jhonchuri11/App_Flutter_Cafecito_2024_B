package com.cafecitodev.cafecitod.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NonNull
    private String title;
    @NonNull
    private String description;
    @NonNull
    private String image;
    @NonNull
    private String author;
    @NonNull
    private LocalDateTime createdAt;
}
