package com.api.skyscanner.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Traveller")
public class Traveller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long travellerId;

    private String firstName;
    private String lastName;
    private int age;
    private String passportNo;

    @ManyToOne
    private TravelRecord travelRecord;

}
