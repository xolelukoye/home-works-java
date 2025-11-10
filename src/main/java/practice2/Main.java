package practice2;


public class Main {
    static void main(String[] args) {

        Car someCar = new Car("Audi", 2006);

        someCar.setYear(2010);
        someCar.print();

        Rectangle newRectangle = new Rectangle(5, 8);

        System.out.println("Ширина: " + newRectangle.getWeight());
        newRectangle.setWeight(6);
        System.out.println("Ширина: " + newRectangle.getWeight());
        System.out.println("Площадь прямоугольника: " + newRectangle.calculateArea());


        Book newBook = new Book("Shine", "S.King");

        System.out.println("Author: " + newBook.getAuthor());
        newBook.setAuthor("J.Hill");
        newBook.printInfo();

        BankAccount newAccount = new BankAccount("Vasya", 1000);

        newAccount.printBalance();
        newAccount.deposit(100);
        newAccount.printBalance();
        newAccount.withdraw(200.67);
        newAccount.printBalance();

        Point newPoint = new Point(5, 9);

        newPoint.print();
        newPoint.setX(8);
        newPoint.print();

        StudentGroup newGroup = new StudentGroup("First", 24);

        newGroup.printInfo();
        newGroup.setStudentCount(30);
        newGroup.printInfo();

        Circle newCircle = new Circle(9);

        System.out.println("Площадь: " + newCircle.calculateArea() + ", длина окружности: " + newCircle.calculateCircumference());
        newCircle.setRadius(5);
        System.out.println("Площадь: " + newCircle.calculateArea() + ", длина окружности: " + newCircle.calculateCircumference());

        Teacher newTeacher = new Teacher("В.Владимировна", "Математика");

        newTeacher.printInfo();
        newTeacher.setSubject("Геометрия");
        newTeacher.printInfo();

        Product newProduct = new Product("Стол", 100);

        newProduct.printInfo();
        newProduct.setPrice(150);
        newProduct.printInfo();
        System.out.println("Применили скидку: " + newProduct.applyDiscount(20));

        Laptop newLaptop = new Laptop("Asus", 133.8);

        newLaptop.printInfo();
        newLaptop.setPrice(140.5);
        newLaptop.printInfo();

    }
}
