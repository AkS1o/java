package Hibernate.program;
import org.hibernate.Session;
import Hibernate.utils.HibernateSessionFactoryUtil;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        System.out.println("Connection is good");
        session.close();
    }
}
