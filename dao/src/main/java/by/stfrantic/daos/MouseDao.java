package by.stfrantic.daos;

import by.stfrantic.entities.Mouse;

public interface MouseDao {
    Mouse save(Mouse mouse);
    void update(Mouse mouse);
    void delete(Mouse mouse);
    Mouse read(Long id);
}
