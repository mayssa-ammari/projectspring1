package tn.esprit.tic.se.springproject1.services;

import tn.esprit.tic.se.springproject1.entities.Foyer;
import tn.esprit.tic.se.springproject1.repository.FoyerRepository;

import java.util.List;

public class FoyerService implements IFoyerService {

    FoyerRepository foyerRepository ;

    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }


    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
        //return foyerRepository.findById(idFoyer).orElse(null);
    }


    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);

    }
}
