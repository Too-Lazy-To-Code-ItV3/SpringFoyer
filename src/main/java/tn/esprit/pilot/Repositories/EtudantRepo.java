package tn.esprit.pilot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pilot.Entities.Etudiant;

@Repository
public interface EtudantRepo extends JpaRepository<Etudiant,Long> {
}
