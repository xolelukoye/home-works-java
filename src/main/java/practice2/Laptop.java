package practice2;

public class Laptop {

    String brand;
    double price;

    Laptop(String someBrand, double somePrice) {
        this.brand = someBrand;
        this.price = somePrice;
    }

    String getBrand() {
        return this.brand;
    }

    double getPrice() {
        return this.price;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    void printInfo() {
        System.out.println("Ноутбук: " + this.brand + ", цена: " + this.price);
    }

}
