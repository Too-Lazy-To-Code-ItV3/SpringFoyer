package tn.esprit.pilot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pilot.Entities.Foyer;

@Repository

public interface FoyerRepo extends JpaRepository<Foyer,Long> {

}
