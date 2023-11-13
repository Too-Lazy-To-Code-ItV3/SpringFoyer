package tn.esprit.pilot.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    String nomBloc;

    long capacite;

    @ManyToOne()
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    List<Chambre>chambres=new ArrayList<Chambre>();
}
