package tn.esprit.tic.se.springproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.se.springproject1.entities.Chambre;
import tn.esprit.tic.se.springproject1.entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {

    List<Chambre> findByBlocIdBlocAndTypeC(Long idBloc,TypeChambre T);
    List<Chambre> findByReservationEstValide( Boolean estValide);
    List<Chambre> findByBlocCapaciteBlocGreaterThanAndBlocNomBloc(Long capaciteBloc , String nomBloc   );
}
