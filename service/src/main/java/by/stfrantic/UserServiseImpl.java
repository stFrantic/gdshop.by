package by.stfrantic;

import by.stfrantic.daos.UserDao;
import by.stfrantic.daos.UserDaoImpl;
import by.stfrantic.entities.User;

public class UserServiseImpl implements UserService {

    public User save(User user) {
        UserDao userDao = new UserDaoImpl();
        user.setRole("user");
        return userDao.save(user);
    }

    public void update(User user) {
        UserDao userDao = new UserDaoImpl();
        userDao.update(user);

    }

    public User read(Long id) {
        UserDao userDao = new UserDaoImpl();
        return userDao.read(id);
    }
}
