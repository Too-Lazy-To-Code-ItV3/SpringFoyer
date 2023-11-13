package tn.esprit.pilot.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pilot.Entities.Universite;
import tn.esprit.pilot.Services.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Universite")
public class UniversiteRestController {
    IUniversiteService iUniversiteService;
    @GetMapping("/affichertout")
    List<Universite> retrieveAllUniversites()
    {
        return iUniversiteService.retrieveAllUniversities();
    }
    @PostMapping("/ajouterUniversite")
    Universite addUniversite(@RequestBody Universite c){
        return iUniversiteService.addUniversity(c);
    }

    @PutMapping("/update")
    Universite updateUniversite (@RequestBody Universite c)
    {
        return iUniversiteService.updateUniversity(c);
    }
}
