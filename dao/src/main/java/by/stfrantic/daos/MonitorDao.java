package by.stfrantic.daos;

import by.stfrantic.entities.Monitor;


public interface MonitorDao {
    Monitor save(Monitor monitor);
    void update(Monitor monitor);
    void delete(Monitor monitor);
    Monitor read(Long id);
}
