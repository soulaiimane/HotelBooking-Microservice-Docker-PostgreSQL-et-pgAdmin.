package org.sid.hotelservice.repositories;

import org.sid.hotelservice.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
