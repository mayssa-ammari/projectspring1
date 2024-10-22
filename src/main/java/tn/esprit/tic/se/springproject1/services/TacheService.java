package tn.esprit.tic.se.springproject1.services;

import tn.esprit.tic.se.springproject1.entities.Tache;
import tn.esprit.tic.se.springproject1.repository.TacheRepository;

import java.util.List;

public class TacheService implements ITacheService {

    TacheRepository tacheRepository ;

    public List<Tache> retrieveAllTaches() {
        return tacheRepository.findAll();
    }

    @Override
    public Tache addTache(Tache t) {
        return tacheRepository.save(t);
    }

    @Override
    public Tache updateTache(Tache t) {
        return tacheRepository.save(t);
    }


    public Tache retrieveTache(Long idTache) {
        return tacheRepository.findById(idTache).get();

    }


    public void removeTache(Long idTache) {
        tacheRepository.deleteById(idTache);

    }
}
