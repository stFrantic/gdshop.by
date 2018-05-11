package by.stfrantic;

import by.stfrantic.entities.Product;

public interface ProductService {
    Product save(Product product);
    void update(Product product);
    Product read(Long id);
}
