package by.stfrantic;

import by.stfrantic.entities.Order;

public interface OrderService {
    Order save(Order order);
    void update(Order order);
    Order read(Long id);
}
