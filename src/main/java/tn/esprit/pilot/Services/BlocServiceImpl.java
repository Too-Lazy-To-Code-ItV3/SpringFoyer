package tn.esprit.pilot.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pilot.Entities.Bloc;
import tn.esprit.pilot.Entities.Chambre;
import tn.esprit.pilot.Repositories.BlocRepo;
import tn.esprit.pilot.Repositories.ChambreRepo;
import tn.esprit.pilot.Repositories.FoyerRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService{
    BlocRepo blocRepo;
    FoyerRepo foyerRepo;
    ChambreRepo chambreRepo;
    @Override
    public List<Bloc> retrieveBlocs() {
        return  blocRepo.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepo.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {

    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {
        Bloc bloc=blocRepo.findBlocByNomBloc(nomBloc);
        Chambre chambre;
        for (Long num:numChambre){
            chambre= chambreRepo.findChambreByNumeroChamber(num);
            chambre.setBloc(bloc);
            chambreRepo.save(chambre);
        }
        return blocRepo.findBlocByNomBloc(nomBloc);
    }

}
