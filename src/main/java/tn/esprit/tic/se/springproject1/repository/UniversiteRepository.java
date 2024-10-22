package tn.esprit.tic.se.springproject1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.se.springproject1.entities.Universite;
public interface UniversiteRepository extends JpaRepository <Universite, Long> {
}
