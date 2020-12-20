package com.homework.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Tickets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticket_id;

    private String movie_cinema_id;
    private String user_id;

    private LocalDateTime date_time;
    private Long row_number;
    private Long seat_number;

    public Tickets(String movie_cinema_id, String user_id, LocalDateTime date_time, Long row_number, Long seat_number) {
        this.movie_cinema_id = movie_cinema_id;
        this.user_id = user_id;
        this.date_time = date_time;
        this.row_number = row_number;
        this.seat_number = seat_number;
    }
}
