package by.stfrantic;

import by.stfrantic.entities.Monitor;


public interface MonitorService {
    Monitor save(Monitor monitor);
    void update(Monitor monitor);
    Monitor read(Long id);
}
