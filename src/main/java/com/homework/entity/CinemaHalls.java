package com.homework.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CinemaHalls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cinema_id;

    private String name;
    private String sponsored_name;
    private String location_id;

    public CinemaHalls(Long cinema_id, String name, String sponsored_name, String location_id) {
        this.cinema_id = cinema_id;
        this.name = name;
        this.sponsored_name = sponsored_name;
        this.location_id = location_id;
    }
}
