package oopWithNlayeredApp.business;

import oopWithNlayeredApp.dataAccess.HibernateProductDao;
import oopWithNlayeredApp.core.logging.Logger;
import oopWithNlayeredApp.dataAccess.JdbcProductDao;
import oopWithNlayeredApp.dataAccess.ProductDao;
import oopWithNlayeredApp.entities.Product;

import java.util.List;

public class ProductManager {


    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao,Logger[] loggers ) {
        this.productDao = productDao;
        this.loggers = loggers;
    }


    public void add(Product product) throws Exception {
        //business rules
        if (product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }

        JdbcProductDao productDao = new JdbcProductDao();
        ProductDao productDao2 = new HibernateProductDao();

        productDao.add(product);

        for (Logger logger :loggers){  //[db,fail]
            logger.log(product.getName());
        }
    }
}