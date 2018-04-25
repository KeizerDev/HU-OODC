package DAO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ReizigerDaoImpl rdi = new ReizigerDaoImpl();


        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

        Date d1 = new Date();
        Date d2 = new Date();
        Date d3 = new Date();

        try {
            d1 = format.parse("01/01/1998");
            d2 = format.parse("01/01/1996");
            d3 = format.parse("01/01/1997");
        } catch (Exception e) {
            e.printStackTrace();
        }


        Reiziger r1 = new Reiziger("Meneer Keizer", d1);
        Reiziger r2 = new Reiziger("Mevrouw Keizer", d2);
        Reiziger r3 = new Reiziger("Peter Keizer", d3);

        rdi.save(r1);
        rdi.save(r2);
        rdi.save(r3);

        System.out.println("01/01/1998: ");
        System.out.println(rdi.findByGBdatum("01/01/1998"));

        System.out.println("Reiziger 1 is verwijderd: " + rdi.delete(r1));

        r1.setNaam("Meneer Koning");
        rdi.update(r1);

        System.out.println("Alle gebruikers: ");
        System.out.println(rdi.findAll());
    }
}
