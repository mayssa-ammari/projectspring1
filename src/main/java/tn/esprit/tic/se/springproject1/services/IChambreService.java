package tn.esprit.tic.se.springproject1.services;

import tn.esprit.tic.se.springproject1.entities.Chambre;



import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres() ;
    Chambre addChambre (Chambre c) ;
    Chambre updateChambre (Chambre f) ;
    Chambre retrieveChambre(Long idChambre ) ;
    void removeChambre(Long idChambre ) ;
}
