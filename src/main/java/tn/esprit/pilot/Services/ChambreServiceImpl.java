package tn.esprit.pilot.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pilot.Entities.Chambre;
import tn.esprit.pilot.Entities.TypeChambre;
import tn.esprit.pilot.Repositories.ChambreRepo;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService{

    ChambreRepo chambreRepo;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepo.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {

        return null;
    }

    @Override
    public List<Chambre> getChambresParNomBloc(String nomBloc) {
        return chambreRepo.findChambresByBloc_NomBloc(nomBloc);
    }

    @Override
    public long nbChambreParTypeEtBloc(TypeChambre type, long idBloc) {
        return chambreRepo.countChambresByTypeCAndBloc_IdBloc(type,idBloc);
    }
}
