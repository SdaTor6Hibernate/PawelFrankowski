
import model.*;
import org.hibernate.Session;
        import util.HibernateUtil;

public class przyklad1 {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Product product = session.find(Product.class, 1);
        System.out.println(product.getProductDescription());
        session.close();
    }
}
