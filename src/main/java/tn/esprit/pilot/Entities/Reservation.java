package tn.esprit.pilot.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Reservation {
    @Id
    private String idReservation;
    LocalDate anneeUniversitaire;
    boolean estValide;

    @ManyToMany(mappedBy = "reservations")
    List<Etudiant>etudiants;

}
