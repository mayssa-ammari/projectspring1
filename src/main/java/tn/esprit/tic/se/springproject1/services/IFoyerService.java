package tn.esprit.tic.se.springproject1.services;

import tn.esprit.tic.se.springproject1.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers() ;
    Foyer addFoyer (Foyer f) ;
    Foyer updateFoyer (Foyer f) ;
    Foyer retrieveFoyer ( Long idFoyer ) ;
    void removeFoyer(Long idFoyer ) ;
 }
