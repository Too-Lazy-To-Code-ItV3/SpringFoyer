package tn.esprit.pilot.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    String nomFoyer;
    long capacite;
    @OneToMany(mappedBy = "foyer")
    List<Bloc> blocs;
    @OneToOne(mappedBy = "foyer")
    Universite universite;
}
