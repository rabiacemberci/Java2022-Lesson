package oopWithNlayeredApp.dataAccess;

import oopWithNlayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        //db erişim kodları yazılacak.. SQL
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
