package by.stfrantic;

import by.stfrantic.daos.OrderDao;
import by.stfrantic.daos.OrderDaoImpl;
import by.stfrantic.entities.Order;

public class OrderServiceImpl implements OrderService {
    public Order save(Order order) {
        OrderDao orderDao = (OrderDao) new OrderDaoImpl();
        return orderDao.save(order);
    }

    public void update(Order order) {
        OrderDao orderDao = (OrderDao) new OrderDaoImpl();
        orderDao.update(order);

    }

    public Order read(Long id) {
        OrderDao orderDao = (OrderDao) new OrderDaoImpl();
        return orderDao.read(id);
    }
}
