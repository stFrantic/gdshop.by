package by.stfrantic.daos;

import by.stfrantic.config.HibernateUtil;
import by.stfrantic.entities.Headphone;
import org.hibernate.Session;

public class HeadphoneDaoImpl implements HeadphoneDao {

    public Headphone read(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Headphone headphone = (Headphone) session.get(Headphone.class, id);
        session.getTransaction().commit();
        return headphone;
    }

    public void update(Headphone headphone) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(headphone);
        session.getTransaction().commit();
    }

    public void delete(Headphone headphone) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(headphone);
        session.getTransaction().commit();
    }

    public Headphone save(Headphone headphone) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(headphone);
        session.getTransaction().commit();
        return headphone;
    }
}
