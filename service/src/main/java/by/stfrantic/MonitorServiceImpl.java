package by.stfrantic;

import by.stfrantic.daos.MonitorDao;
import by.stfrantic.daos.MonitorDaoImpl;
import by.stfrantic.entities.Monitor;



public class MonitorServiceImpl implements MonitorService {
    public Monitor save(Monitor monitor) {
        MonitorDao monitorDao = (MonitorDao) new MonitorDaoImpl();
        return monitorDao.save(monitor);
    }

    public void update(Monitor monitor) {
        MonitorDao monitorDao = (MonitorDao) new MonitorDaoImpl();
        monitorDao.update(monitor);

    }

    public Monitor read(Long id) {
        MonitorDao monitorDao = (MonitorDao) new MonitorDaoImpl();
        return monitorDao.read(id);
    }
}
