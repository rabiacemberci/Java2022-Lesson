package oopWithNlayeredApp;

import oopWithNlayeredApp.business.ProductManager;
import oopWithNlayeredApp.core.logging.DatabaseLogger;
import oopWithNlayeredApp.core.logging.FileLogger;
import oopWithNlayeredApp.core.logging.Logger;
import oopWithNlayeredApp.core.logging.MailLogger;
import oopWithNlayeredApp.dataAccess.HibernateProductDao;
import oopWithNlayeredApp.entities.Product;

public class Main {
    public static void main (String[] args) throws Exception {
        Product product1 = new Product(1," IPhone Xr",1000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
    }
}

