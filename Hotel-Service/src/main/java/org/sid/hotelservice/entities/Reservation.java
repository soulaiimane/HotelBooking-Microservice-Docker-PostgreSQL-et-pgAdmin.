package org.sid.hotelservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.hotelservice.enums.reservationStatus;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;
    private String titre;
    private Date dateReservation;
    private Double priceReservation;
    @Enumerated(EnumType.STRING)
    private reservationStatus status;
}
