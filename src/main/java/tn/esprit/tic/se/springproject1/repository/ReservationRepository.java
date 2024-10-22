package tn.esprit.tic.se.springproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.se.springproject1.entities.Foyer;
import tn.esprit.tic.se.springproject1.entities.Reservation;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, String> {







}
