package oopWithNlayeredApp.dataAccess;

import oopWithNlayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product){
        //db erişim kodları yazılacak.. SQL
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
