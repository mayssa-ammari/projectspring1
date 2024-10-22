package tn.esprit.tic.se.springproject1.services;

import tn.esprit.tic.se.springproject1.entities.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservations() ;
    Reservation addReservation (Reservation r) ;
    Reservation updateReservation (Reservation r) ;
    Reservation retrieveReservation ( Long idReservation ) ;
    void removeReservation (Long idReservation ) ;
}
