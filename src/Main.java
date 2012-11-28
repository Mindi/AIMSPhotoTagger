

 import javax.persistence.*;
 import java.sql.Statement;
 import java.util.List;
 import java.sql.ResultSet;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "REEF-DERBY";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
         factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        Query q = em.createQuery("SELECT k FROM Keywords k");
        List<Keywords> keywords =  q.getResultList();

        for (Keywords keyword : keywords){
            System.out.println(keyword.getKeyword());
        }
        q = em.createQuery("SELECT g FROM ReefGeolocale g ");

        List<ReefGeolocale> reefs =q.getResultList();

        for (ReefGeolocale reef : reefs){
            System.out.println(reef.getReefName());
            System.out.println(reef.getRmSectorByASector().getDesc1());

        }
         }
}
