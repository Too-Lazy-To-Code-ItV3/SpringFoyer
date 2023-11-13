package tn.esprit.pilot.Services;

import tn.esprit.pilot.Entities.Chambre;
import tn.esprit.pilot.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversities();

    Universite addUniversity (Universite u);

    Universite updateUniversity (Universite u);

    Universite retrieveUniversity (long idUniversity);
}
