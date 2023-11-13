package tn.esprit.pilot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pilot.Entities.Universite;

@Repository
public interface UniversiteRepo extends JpaRepository<Universite,Long> {
}
