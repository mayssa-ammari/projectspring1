package tn.esprit.tic.se.springproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.se.springproject1.entities.Bloc;
import tn.esprit.tic.se.springproject1.entities.Foyer;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc, Long> {


        List<Bloc> findByFoyerUniversiteIdUniversite(Long idUniversite);

}



