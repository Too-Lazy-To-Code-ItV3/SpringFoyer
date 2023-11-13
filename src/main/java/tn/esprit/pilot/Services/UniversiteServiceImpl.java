package tn.esprit.pilot.Services;

import org.springframework.stereotype.Service;
import tn.esprit.pilot.Entities.Chambre;
import tn.esprit.pilot.Entities.Universite;
import tn.esprit.pilot.Repositories.UniversiteRepo;

import java.util.List;

@Service
public class UniversiteServiceImpl implements IUniversiteService{
    UniversiteRepo universiteRepo;

    @Override
    public List<Universite> retrieveAllUniversities() {
        return universiteRepo.findAll();
    }

    @Override
    public Universite addUniversity(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite retrieveUniversity(long idUniversity) {
        return null;
    }
}
