package pl.sda.hibernate.inheritance.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pl.sda.hibernate.inheritance.model.joinedtable.DirectorV3;
import pl.sda.hibernate.inheritance.model.singletable.DirectorV2;
import pl.sda.hibernate.inheritance.model.tableperclass.Director;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        System.out.println("zbudowano baze danych");

        Director d = new Director();
        d.setName("Jan");
        d.setSurname("Kowalski");
        d.setDepartments("Finanse i Ksiegowosc");

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        session.save(d);

        tx.commit();
        session.close();

        sessionFactory.close();

    }
}
