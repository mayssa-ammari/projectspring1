package tn.esprit.tic.se.springproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.se.springproject1.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long > {
}
