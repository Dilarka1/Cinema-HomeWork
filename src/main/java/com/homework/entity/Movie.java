package com.homework.entity;

import com.homework.enums.State;
import com.homework.enums.Types;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movie_id;

    private String name;
    private Long price;

    @Enumerated(EnumType.STRING)
    private Types types;

    @Enumerated(EnumType.STRING)
    private State state;

    @Column(columnDefinition = "DATE")
    private LocalDate release_date;

    private Long duration;
    private String summary;

    public Movie(String name, Long price, Types types, State state, LocalDate release_date, Long duration, String summary) {
        this.name = name;
        this.price = price;
        this.types = types;
        this.state = state;
        this.release_date = release_date;
        this.duration = duration;
        this.summary = summary;
    }
}
