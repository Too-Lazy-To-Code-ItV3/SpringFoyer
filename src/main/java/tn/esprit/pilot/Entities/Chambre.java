package tn.esprit.pilot.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import tn.esprit.pilot.Entities.TypeChambre;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    long numeroChamber;
    @Enumerated(EnumType.STRING)
    TypeChambre typeC;

    @ManyToOne()
    @JsonIgnore
    Bloc bloc;

    @OneToMany()
    List<Reservation>reservations;
}
