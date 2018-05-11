package by.stfrantic;

import by.stfrantic.daos.ProductDao;
import by.stfrantic.daos.ProductDaoImpl;
import by.stfrantic.entities.Product;


public class ProductServiceImpl implements ProductService {

    public Product save(Product product) {
        ProductDao productDao = new ProductDaoImpl();
        return productDao.save(product);
    }

    public void update(Product product) {
        ProductDao productDao = new ProductDaoImpl();
        productDao.update(product);

    }

    public Product read(Long id) {
        ProductDao  productDao = new ProductDaoImpl();
        return productDao.read(id);
    }
}
