package practice2;

public class Car {
    String brand;
    int year;

    Car(String newBrand, int newYear) {
        this.brand = newBrand;
        this.year = newYear;
    }

    String getBrand() {
        return this.brand;
    }

    int getYear() {
        return this.year;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    void print() {
        System.out.println("Бренд автомобиля: " + this.brand + ", год выпуска: " + this.year);
    }

}
