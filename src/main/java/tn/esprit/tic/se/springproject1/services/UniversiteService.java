package tn.esprit.tic.se.springproject1.services;

import tn.esprit.tic.se.springproject1.entities.Universite;
import tn.esprit.tic.se.springproject1.repository.UniversiteRepository;

import java.util.List;

public class UniversiteService implements IUniversiteService {

    UniversiteRepository universiteRepository ;

    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }


    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();

    }


    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);

    }
}
