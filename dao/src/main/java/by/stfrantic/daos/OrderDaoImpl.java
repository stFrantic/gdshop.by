package by.stfrantic.daos;

import by.stfrantic.config.HibernateUtil;
import by.stfrantic.entities.Order;
import org.hibernate.Session;

public class OrderDaoImpl implements OrderDao {

    public Order read(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Order order = (Order) session.get(Order.class, id);
        session.getTransaction().commit();
        return order;
    }

    public void update(Order order) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(order);
        session.getTransaction().commit();
    }

    public void delete(Order order) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(order);
        session.getTransaction().commit();
    }

    public Order save(Order order) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(order);
        session.getTransaction().commit();
        return order;
    }
}
