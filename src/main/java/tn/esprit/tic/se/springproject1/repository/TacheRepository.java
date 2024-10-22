package tn.esprit.tic.se.springproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.se.springproject1.entities.Tache;

public interface TacheRepository extends JpaRepository <Tache , Long>  {
}
