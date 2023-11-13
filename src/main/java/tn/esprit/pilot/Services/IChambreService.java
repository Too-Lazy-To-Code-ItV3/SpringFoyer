package tn.esprit.pilot.Services;

import tn.esprit.pilot.Entities.Chambre;
import tn.esprit.pilot.Entities.TypeChambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c); // ajouter l’équipe avec son détail

    Chambre updateChambre (Chambre c);

    Chambre retrieveChambre (long idChambre);

    public List<Chambre> getChambresParNomBloc( String nomBloc) ;

    public long nbChambreParTypeEtBloc(TypeChambre type, long idBloc) ;

}
