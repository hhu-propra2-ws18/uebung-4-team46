package de.hhu.propra.db.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Auto{
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Kunde besitzer;

    private String marke;
    private String farbe;
    private int hubraum;

}

