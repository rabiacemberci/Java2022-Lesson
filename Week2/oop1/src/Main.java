public class Main {
    public static void main(String[] args) {

        String mesaj = "Vade oranı";

        Product product1 = new Product(); //Class değişkeni oluşturma.

                        //set value
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStocks(3);
        product1.setImageUrl("image1.jpg");
                        //get
        //System.out.println(product1.name);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(6500);
        product2.setUnitInStocks(3);
        product2.setImageUrl("image2.jpg");


        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitInStocks(3);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1, product2, product3};


        System.out.println("<ul>");
        for (Product product: products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");


        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05417158500");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Rabia");
        individualCustomer.setLastName("Çemberci");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("kodlama.io");
        corporateCustomer.setPhone("05417158500");
        corporateCustomer.setTaxNumber("111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer,corporateCustomer};






    }
}
