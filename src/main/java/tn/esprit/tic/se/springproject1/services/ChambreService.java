package tn.esprit.tic.se.springproject1.services;
import tn.esprit.tic.se.springproject1.entities.Chambre;
import tn.esprit.tic.se.springproject1.repository.ChambreRepository;

import java.util.List;

public class ChambreService implements IChambreService {
    ChambreRepository chambreRepository;

    public List<Chambre> retrieveAllFoyers() {
        return chambreRepository.findAll();
    }

    @Override
    public List<Chambre> retrieveAllChambres() {
        return List.of();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }


    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).get();

    }

    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);

    }
}
