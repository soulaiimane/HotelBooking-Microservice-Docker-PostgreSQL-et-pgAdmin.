package org.sid.hotelservice;

import org.sid.hotelservice.entities.Reservation;
import org.sid.hotelservice.enums.reservationStatus;
import org.sid.hotelservice.repositories.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HotelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner (ReservationRepository reservationRepository){
		return args -> {
			reservationRepository.save(new Reservation(null,"reservation 1"
					,new Date(),Math.random()*10000, reservationStatus.Created));
			reservationRepository.save(new Reservation(null,"reservation 2"
					,new Date(),Math.random()*10000, reservationStatus.Confirmed));
			reservationRepository.save(new Reservation(null,"reservation 3"
					,new Date(),Math.random()*10000, reservationStatus.Pending));
			reservationRepository.save(new Reservation(null,"reservation 4"
					,new Date(),Math.random()*10000, reservationStatus.Canceled));
			reservationRepository.save(new Reservation(null,"reservation 5"
					,new Date(),Math.random()*10000, reservationStatus.Created));
			reservationRepository.save(new Reservation(null,"reservation 6"
					,new Date(),Math.random()*10000, reservationStatus.Confirmed));
			reservationRepository.save(new Reservation(null,"reservation 7"
					,new Date(),Math.random()*10000, reservationStatus.Pending));
			reservationRepository.save(new Reservation(null,"reservation 8"
					,new Date(),Math.random()*10000, reservationStatus.Canceled));
			reservationRepository.save(new Reservation(null,"reservation 9"
					,new Date(),Math.random()*10000, reservationStatus.Created));
			reservationRepository.save(new Reservation(null,"reservation 10"
					,new Date(),Math.random()*10000, reservationStatus.Confirmed));
			reservationRepository.save(new Reservation(null,"reservation 11"
					,new Date(),Math.random()*10000, reservationStatus.Pending));
			reservationRepository.save(new Reservation(null,"reservation 12"
					,new Date(),Math.random()*10000, reservationStatus.Canceled));
			reservationRepository.save(new Reservation(null,"reservation 13"
					,new Date(),Math.random()*10000, reservationStatus.Created));
			reservationRepository.save(new Reservation(null,"reservation 14"
					,new Date(),Math.random()*10000, reservationStatus.Confirmed));
			reservationRepository.save(new Reservation(null,"reservation 15"
					,new Date(),Math.random()*10000, reservationStatus.Pending));
			reservationRepository.save(new Reservation(null,"reservation 16"
					,new Date(),Math.random()*10000, reservationStatus.Canceled));
			reservationRepository.save(new Reservation(null,"reservation 17"
					,new Date(),Math.random()*10000, reservationStatus.Created));
			reservationRepository.save(new Reservation(null,"reservation 18"
					,new Date(),Math.random()*10000, reservationStatus.Confirmed));
			reservationRepository.save(new Reservation(null,"reservation 19"
					,new Date(),Math.random()*10000, reservationStatus.Pending));
			reservationRepository.save(new Reservation(null,"reservation 20"
					,new Date(),Math.random()*10000, reservationStatus.Canceled));
		};
	}

}
