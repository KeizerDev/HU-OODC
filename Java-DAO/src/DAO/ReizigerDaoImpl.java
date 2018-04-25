package DAO;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReizigerDaoImpl extends OracleBaseDao implements ReizigerDao {

    private ArrayList<Reiziger> reizigers = new ArrayList<Reiziger>();

    public List<Reiziger> findAll() {
        return this.reizigers;
    }

    public List<Reiziger> findByGBdatum(String GBDatum) {
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        Date date = new Date();

        try {
            date = format.parse(GBDatum);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Reiziger> results = new ArrayList<Reiziger>();

        for (Reiziger reiziger : this.reizigers) {
            if (reiziger.getGeboortedatum().equals(date)) {
                results.add(reiziger);
            }
        }

        return results;
    }

    public Reiziger save(Reiziger reiziger) {
        if (!this.reizigers.contains(reiziger)) {
            this.reizigers.add(reiziger);
        }
        return reiziger;
    }

    public Reiziger update(Reiziger reiziger) {
        for (Reiziger r : this.reizigers) {
            if (r.equals(reiziger)) {
                r.setNaam(reiziger.getNaam());
                r.setGeboortedatum(reiziger.getGeboortedatum());
            }
        }

        return reiziger;
    }

    public Boolean delete(Reiziger reiziger) {
        return this.reizigers.remove(reiziger);
    }
}
