package tn.esprit.pilot.Controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pilot.Entities.Chambre;
import tn.esprit.pilot.Entities.TypeChambre;
import tn.esprit.pilot.Services.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Chambre")
public class ChamberRestController {
    IChambreService iChambreService;
    @GetMapping("/affichertout")
    List<Chambre> retrieveAllChambres()
    {
        return iChambreService.retrieveAllChambres();
    }
    @PostMapping("/ajouterChambre")
    Chambre addChambre(@RequestBody Chambre c){
        return iChambreService.addChambre(c);
    }

    @PutMapping("/update")
    Chambre updateChambre (@RequestBody Chambre c)
    {
        return iChambreService.updateChambre(c);
    }

    Chambre retrieveChambre (long idChambre)
    {
        return null;
    }

    @GetMapping("show/{nombloc}")
    List<Chambre>getChambresParNomBloc(@PathVariable("nombloc") String nom)
    {
        return iChambreService.getChambresParNomBloc(nom);
    }

    @GetMapping("Showt/{typec}/{id}")
    long nbChambreParTypeEtBloc(@PathVariable("typec") TypeChambre type, @PathVariable("id") long idBloc)
    {
        return iChambreService.nbChambreParTypeEtBloc(type,idBloc);
    }
}
