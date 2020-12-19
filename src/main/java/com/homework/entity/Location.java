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
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String location_id;

    private String name;
    private Float latitude;
    private Float longitude;

    public Location(String location_id, String name, Float latitude, Float longitude) {
        this.location_id = location_id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
