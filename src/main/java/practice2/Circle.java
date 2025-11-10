package practice2;

public class Circle {

    int radius;

    Circle(int someRadius) {
        this.radius = someRadius;
    }

    int detRadius() {
        return this.radius;
    }

    void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    int calculateArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }

    int calculateCircumference() {
        return (int) (2 * Math.PI * radius);
    }

}
