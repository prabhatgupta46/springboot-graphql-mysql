package com.api.skyscanner.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TravelRecord")
public class TravelRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long travelId;

    @OneToMany
    private List<Traveller> traveller;

    @Column(name = "airline")
    private String airline;

    @Column(name = "source")
    private String source;

    @Column(name = "destination")
    private String  destination;

    @Column(name = "bookingCode")
    private String bookingCode;
}
