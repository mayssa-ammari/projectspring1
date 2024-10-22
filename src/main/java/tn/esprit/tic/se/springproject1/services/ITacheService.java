package tn.esprit.tic.se.springproject1.services;

import tn.esprit.tic.se.springproject1.entities.Tache;

import java.util.List;

public interface ITacheService {
    List<Tache> retrieveAllTaches() ;
    Tache addTache (Tache t) ;
    Tache updateTache (Tache t) ;
    Tache  retrieveTache ( Long idTache ) ;
    void removeTache (Long idTache ) ;
}
