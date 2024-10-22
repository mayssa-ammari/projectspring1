package tn.esprit.tic.se.springproject1.services;
import tn.esprit.tic.se.springproject1.entities.Bloc;

import tn.esprit.tic.se.springproject1.repository.BlocRepository;

import java.util.List;

public class BlocService implements IBlocService {
    BlocRepository blocRepository ;

    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc addChambre(Bloc b) {
        return null;
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }


    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();

    }


    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);

    }
}

