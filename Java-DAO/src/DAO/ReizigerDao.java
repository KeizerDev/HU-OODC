package DAO;

import java.util.List;

public interface ReizigerDao {

    List<Reiziger> findAll();

    List<Reiziger> findByGBdatum(String GBDatum);

    Reiziger save(Reiziger reiziger);

    Reiziger update(Reiziger reiziger);

    Boolean delete(Reiziger reiziger);

    void closeConnection();
}
