package by.stfrantic.daos;

import by.stfrantic.config.HibernateUtil;
import by.stfrantic.entities.Monitor;
import org.hibernate.Session;

public class MonitorDaoImpl implements MonitorDao {

    public Monitor read(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Monitor monitor = (Monitor) session.get(Monitor.class, id);
        session.getTransaction().commit();
        return monitor;
    }

    public void update(Monitor monitor) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(monitor);
        session.getTransaction().commit();
    }

    public void delete(Monitor monitor) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(monitor);
        session.getTransaction().commit();
    }

    public Monitor save(Monitor monitor) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(monitor);
        session.getTransaction().commit();
        return monitor;
    }
}
