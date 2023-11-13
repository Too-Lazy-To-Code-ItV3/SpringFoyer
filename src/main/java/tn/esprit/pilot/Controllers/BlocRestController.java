package tn.esprit.pilot.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pilot.Entities.Bloc;
import tn.esprit.pilot.Entities.Chambre;
import tn.esprit.pilot.Services.IBlocService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Bloc")
public class BlocRestController {
    IBlocService iBlocService;
    @GetMapping("/affichertout")
    List<Bloc> retrieveAllBlocs()
    {
        return iBlocService.retrieveBlocs();
    }
    @PostMapping("/ajouterBloc")
    Bloc addBloc(@RequestBody Bloc c){
        return iBlocService.addBloc(c);
    }

    @PutMapping("/update")
    Bloc updateBloc (@RequestBody Bloc c)
    {
        return iBlocService.updateBloc(c);
    }

    @PutMapping("/chbl/{bloc}")
    Bloc affecterChambresABloc(@RequestBody List<Long> nums,@PathVariable("bloc") String nomBloc){return iBlocService.affecterChambresABloc(nums,nomBloc);}
}
