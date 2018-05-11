package by.stfrantic.daos;

import by.stfrantic.entities.Product;

public interface ProductDao {
    Product save(Product product);
    void update(Product product);
    void delete(Product product);
    Product read(Long id);
}
