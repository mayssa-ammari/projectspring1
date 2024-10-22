package tn.esprit.tic.se.springproject1.services;

import tn.esprit.tic.se.springproject1.entities.Etudiant;
import tn.esprit.tic.se.springproject1.repository.EtudiantRepository;


import java.util.List;

public class EtudiantService implements IEtudiantService {
    EtudiantRepository etudiantRepository ;

    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant f) {
        return etudiantRepository.save(f);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant f) {
        return etudiantRepository.save(f);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return null;
    }





    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);

    }
}


