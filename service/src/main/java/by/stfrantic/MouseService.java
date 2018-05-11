package by.stfrantic;

import by.stfrantic.entities.Mouse;

public interface MouseService {
    Mouse save(Mouse mouse);
    void update(Mouse mouse);
    Mouse read(Long id);
}
