package tn.esprit.tic.se.springproject1.services;


import tn.esprit.tic.se.springproject1.entities.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveAllBlocs() ;
    Bloc addChambre(Bloc b) ;

    Bloc addBloc(Bloc b);

    Bloc updateBloc (Bloc b) ;
    Bloc retrieveBloc(Long idBloc ) ;
    void removeBloc(Long idBloc ) ;
}
