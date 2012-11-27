

 import javax.persistence.*;
 import java.util.List;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "REEF-DERBY";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
         factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        Query q = em.createQuery("SELECT Keyword FROM REEFMON.Keywords;");
        List<String> keywords = q.getResultList();

        for (String keyword : keywords){
            System.out.println(keyword);
        }
         }
}
