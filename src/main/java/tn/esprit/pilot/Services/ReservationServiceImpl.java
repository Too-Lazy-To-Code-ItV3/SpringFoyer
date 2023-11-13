package tn.esprit.pilot.Services;

import org.springframework.stereotype.Service;
import tn.esprit.pilot.Entities.Reservation;
import tn.esprit.pilot.Repositories.ReservationRepo;

import java.time.LocalDate;
import java.util.List;
@Service
public class ReservationServiceImpl implements IReservationSerivce{

    ReservationRepo reservationRepo;
    @Override
    public List<Reservation> retrieveAllReservation() {

        return reservationRepo.findAll();
    }

    @Override
    public Reservation addReservation(Reservation res) {
        return reservationRepo.save(res);
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepo.save(res);
    }

    @Override
    public Reservation retrieveReservation(long idReservation) {
        return null;
    }

    @Override
    public List<Reservation> getReservationParAnneeUniversitaire(LocalDate debutAnnee, LocalDate finAnnee) {
        return reservationRepo.findReservationsByAnneeUniversitaireIsBetween(debutAnnee, finAnnee);}
}
