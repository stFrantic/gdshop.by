package by.stfrantic;

import by.stfrantic.daos.MouseDao;
import by.stfrantic.daos.MouseDaoImpl;
import by.stfrantic.entities.Mouse;

public class MouseServiceImpl implements MouseService {
    public Mouse save(Mouse mouse) {
        MouseDao mouseDao = new MouseDaoImpl();
        return mouseDao.save(mouse);
    }

    public void update(Mouse mouse) {
        MouseDao mouseDao = new MouseDaoImpl();
        mouseDao.update(mouse);

    }

    public Mouse read(Long id) {
        MouseDao mouseDao = new MouseDaoImpl();
        return mouseDao.read(id);
    }
}
