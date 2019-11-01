package ch.zli.m223.punchclock.domain;

import javax.persistence.*;

@Entity
public class Additionen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private long zahlEins;

    @Column(nullable = false)
    private long zahlZwei;

    @Column(nullable = false)
    private long resultat;



    public Additionen(long id, long zahlEins, long zahlZwei, long resultat) {
        this.id = id;
        this.zahlEins = zahlEins;
        this.zahlZwei = zahlZwei;
        this.resultat = zahlEins + zahlZwei;
    }

    public Additionen(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getZahlEins() {
        return zahlEins;
    }

    public void setZahlEins(long zahlEins) {
        this.zahlEins = zahlEins;
    }

    public long getZahlZwei() {
        return zahlZwei;
    }

    public void setZahlZwei(long zahlZwei) {
        this.zahlZwei = zahlZwei;
    }

    public long getResultat() {
        return resultat;
    }

    public void setResultat(long resultat) {
        this.resultat = resultat;
    }
}

