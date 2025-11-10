package practice2;

public class Rectangle {

    int weight;
    int height;

    Rectangle(int someWeight, int someHeight) {
        this.height = someHeight;
        this.weight = someWeight;
    }

    int getHeight() {
        return this.height;
    }

    int getWeight() {
        return this.weight;
    }

    void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    int calculateArea() {
        return height * weight;
    }

}
