package tn.esprit.pilot.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pilot.Entities.Reservation;
import tn.esprit.pilot.Services.IReservationSerivce;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Reservation")
public class ReservationRestController {
    IReservationSerivce iReservationService;
    @GetMapping("/affichertout")
    List<Reservation> retrieveAllReservations()
    {
        return iReservationService.retrieveAllReservation();
    }
    @PostMapping("/ajouterReservation")
    Reservation addReservation(@RequestBody Reservation c){
        return iReservationService.addReservation(c);
    }

    @PutMapping("/update")
    Reservation updateReservation (@RequestBody Reservation c)
    {
        return iReservationService.updateReservation(c);
    }
}
