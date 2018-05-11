package by.stfrantic.daos;

import by.stfrantic.config.HibernateUtil;
import by.stfrantic.entities.Product;
import org.hibernate.Session;

public class ProductDaoImpl implements ProductDao {

    public Product read(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Product product = (Product) session.get(Product.class, id);
        session.getTransaction().commit();
        return product;
    }

    public void update(Product product) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(product);
        session.getTransaction().commit();
    }

    public void delete(Product product) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(product);
        session.getTransaction().commit();
    }

    public Product save(Product product) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(product);
        session.getTransaction().commit();
        return product;
    }
}
