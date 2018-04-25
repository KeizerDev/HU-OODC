package DAO;

import java.util.Date;

public class Reiziger {

    private String naam;
    private Date geboortedatum;

    public Reiziger(String naam, Date geboortedatum) {
        this.naam = naam;
        this.geboortedatum = geboortedatum;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String toString() {
        return this.naam + ", " + this.geboortedatum + ";";
    }
}
