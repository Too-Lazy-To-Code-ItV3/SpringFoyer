package tn.esprit.pilot.Services;

import tn.esprit.pilot.Entities.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface IReservationSerivce {
    List<Reservation> retrieveAllReservation();

    Reservation addReservation (Reservation res);

    Reservation updateReservation (Reservation res);

    Reservation retrieveReservation (long idReservation);

    public List<Reservation> getReservationParAnneeUniversitaire(LocalDate debutAnnee, LocalDate finAnnee ) ;
}
