package tn.esprit.pilot.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pilot.Entities.Etudiant;
import tn.esprit.pilot.Services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Etudiant")
public class EtudiantRestController {
    IEtudiantService iEtudiantService;
    @GetMapping("/affichertout")
    List<Etudiant> retrieveAllEtudiants()
    {
        return iEtudiantService.retrieveAllEtudiants();
    }
    @PostMapping("/ajouterEtudiant")
    List<Etudiant> addEtudiant(@RequestBody List<Etudiant> e){
        return iEtudiantService.addEtudiants(e);
    }

    @PutMapping("/update")
    Etudiant updateEtudiant (@RequestBody Etudiant e)
    {
        return iEtudiantService.updateEtudiant(e);
    }
}
