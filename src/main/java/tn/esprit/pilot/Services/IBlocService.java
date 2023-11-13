package tn.esprit.pilot.Services;

import tn.esprit.pilot.Entities.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveBlocs();

    Bloc updateBloc (Bloc bloc);

    Bloc addBloc (Bloc bloc);

    Bloc retrieveBloc (long idBloc);

    void removeBloc (long idBloc);

    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) ;
}
