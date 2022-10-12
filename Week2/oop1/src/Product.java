//PascalCase
public class Product {

    private String name;  //field'lar camelCase yazılır.
    private double unitPrice;
    private double discount;
    private String imageUrl;   //String[] imagesUrls; ---> Çoklu fotoğraf olabilir.(Arrays ile)
    private int unitInStocks;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUnitInStocks() {
        return unitInStocks;
    }

    public void setUnitInStocks(int unitInStocks) {
        this.unitInStocks = unitInStocks;
    }
}
