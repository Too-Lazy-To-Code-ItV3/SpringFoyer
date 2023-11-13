package tn.esprit.pilot.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pilot.Entities.Foyer;
import tn.esprit.pilot.Services.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Foyer")
public class FoyerRestController {
    IFoyerService iFoyerService;
    @GetMapping("/affichertout")
    List<Foyer> retrieveAllFoyers()
    {
        return iFoyerService.retrieveAllFoyers();
    }
    @PostMapping("/ajouterFoyer")
    Foyer addFoyer(@RequestBody Foyer c){
        return iFoyerService.addFoyer(c);
    }

    @PutMapping("/update")
    Foyer updateFoyer (@RequestBody Foyer c)
    {
        return iFoyerService.updateFoyer(c);
    }
}
