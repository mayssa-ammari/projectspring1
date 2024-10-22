package tn.esprit.tic.se.springproject1.services;

import tn.esprit.tic.se.springproject1.entities.Reservation;
import tn.esprit.tic.se.springproject1.repository.ReservationRepository;

import java.util.List;

public class ReservationService implements IReservationService {

    ReservationRepository reservationRepository ;

    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return null;
    }

    @Override
    public void removeReservation(Long idReservation) {

    }


}
