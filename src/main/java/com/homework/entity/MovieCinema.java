package com.homework.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class MovieCinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movie_cinema_id;

    private String address;

    private Long cinema_id;

    private Long movie_id;

    @Column(columnDefinition = "DATE TIME")
    private LocalDateTime date_time;

    public MovieCinema(String address, Long movie_id, LocalDateTime date_time) {
        this.address = address;
        this.movie_id = movie_id;
        this.date_time = date_time;
    }
}
