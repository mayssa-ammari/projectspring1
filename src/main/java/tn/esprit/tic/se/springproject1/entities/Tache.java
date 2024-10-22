package tn.esprit.tic.se.springproject1.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "Tache")
public class Tache implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTache")
    private Long idTache;

    @Column(name = "dateTache")
    private LocalDate dateTache;

    @Column(name = "duree")
    private Integer duree;

    @Column(name = "tarifHoraire")
    private Float tarifHoraire;

    @Enumerated(EnumType.STRING)
    @Column(name = "typeTache")
    private TypeTache typeTache;

    @ManyToOne
    Etudiant etudiant ;


    public Long getIdTache() {
        return idTache;
    }

    public void setIdTache(Long idTache) {
        this.idTache = idTache;
    }

    public LocalDate getDateTache() {
        return dateTache;
    }

    public void setDateTache(LocalDate dateTache) {
        this.dateTache = dateTache;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Float getTarifHoraire() {
        return tarifHoraire;
    }

    public void setTarifHoraire(Float tarifHoraire) {
        this.tarifHoraire = tarifHoraire;
    }

    public TypeTache getTypeTache() {
        return typeTache;
    }

    public void setTypeTache(TypeTache typeTache) {
        this.typeTache = typeTache;
    }
}
