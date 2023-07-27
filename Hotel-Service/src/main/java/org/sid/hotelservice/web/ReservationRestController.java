package org.sid.hotelservice.web;

import lombok.AllArgsConstructor;
import org.sid.hotelservice.entities.Reservation;
import org.sid.hotelservice.repositories.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationRestController {
    ReservationRepository reservationRepository;

    @GetMapping("/reservations")
    public List<Reservation> consultReservations(){
        return reservationRepository.findAll();
    }
}
