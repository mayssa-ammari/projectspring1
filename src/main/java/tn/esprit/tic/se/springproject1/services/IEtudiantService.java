package tn.esprit.tic.se.springproject1.services;

import tn.esprit.tic.se.springproject1.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants() ;
    Etudiant addEtudiant (Etudiant e) ;
    Etudiant updateEtudiant (Etudiant e) ;
    Etudiant retrieveEtudiant ( Long idEtudiant ) ;
    void removeEtudiant(Long idEtudiant ) ;
}

