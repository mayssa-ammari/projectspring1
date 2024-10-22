package tn.esprit.tic.se.springproject1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.se.springproject1.entities.Foyer;

import java.util.List;

public interface FoyerRepository extends JpaRepository<Foyer, Long> {

    List<Foyer> findByCapaciteFoyerGreaterThan(Long capacite) ;

    List <Foyer> findByUniversiteNomUniversite (String nom) ;


}
