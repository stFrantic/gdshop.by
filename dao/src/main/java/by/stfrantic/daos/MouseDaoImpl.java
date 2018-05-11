package by.stfrantic.daos;

import by.stfrantic.config.HibernateUtil;
import by.stfrantic.entities.Mouse;
import org.hibernate.Session;

public class MouseDaoImpl implements MouseDao {

    public Mouse read(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Mouse mouse = (Mouse) session.get(Mouse.class, id);
        session.getTransaction().commit();
        return mouse;
    }

    public void update(Mouse mouse) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(mouse);
        session.getTransaction().commit();
    }

    public void delete(Mouse mouse) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(mouse);
        session.getTransaction().commit();
    }

    public Mouse save(Mouse mouse) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(mouse);
        session.getTransaction().commit();
        return mouse;
    }
}
