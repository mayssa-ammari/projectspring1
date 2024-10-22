package tn.esprit.tic.se.springproject1.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Bloc")
public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBloc")
    private Long idBloc;

    @Column(name = "nomBloc")
    private String nomBloc;

    @Column(name = "capaciteBloc")
    private Long capaciteBloc;

    @OneToMany(cascade = CascadeType.ALL , mappedBy= "bloc")
    private Set<Chambre> chambres;

    @ManyToOne
    Foyer foyer;


    public Long getIdBloc() {
        return idBloc;
    }

    public void setIdBloc(Long idBloc) {
        this.idBloc = idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public Long getCapaciteBloc() {
        return capaciteBloc;
    }

    public void setCapaciteBloc(Long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }
}
