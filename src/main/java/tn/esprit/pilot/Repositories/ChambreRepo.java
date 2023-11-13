package tn.esprit.pilot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pilot.Entities.Chambre;
import tn.esprit.pilot.Entities.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepo extends JpaRepository<Chambre,Long> {
Chambre findChambreByNumeroChamber(Long numero);
List<Chambre>findChambresByBloc_NomBloc(String nomBloc);
long countChambresByTypeCAndBloc_IdBloc(TypeChambre tc,Long idBloc);


}
