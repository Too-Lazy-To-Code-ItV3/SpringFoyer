package tn.esprit.pilot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pilot.Entities.Bloc;

import java.util.List;

@Repository
public interface BlocRepo extends JpaRepository<Bloc,Long> {

    List<Bloc> findBlocsByFoyer_NomFoyer(String nom);
    Bloc findBlocByNomBloc(String nom);



}

