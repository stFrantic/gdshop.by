package by.stfrantic.daos;

import by.stfrantic.entities.Order;

public interface OrderDao {
    Order save(Order order);
    void update(Order order);
    void delete(Order order);
    Order read(Long id);
}
