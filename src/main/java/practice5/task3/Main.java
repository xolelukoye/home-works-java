package practice5.task3;

//3. Управление рестораном
//Условие:
//В меню ресторана добавляется блюдо.
//У каждого блюда свои параметры отображения:
//Горячее блюдо — с температурой
//Напиток — с объёмом
//Нужно спроектировать систему, в которой можно добавлять блюда и выводить их описание с учётом характеристик.

public class Main {

    public static void main(String[] args) {

        HotDish soup = new HotDish(80);
        Menu menu = new Menu();
        menu.addDish(soup);
        menu.printDescription();

        Drink cocktail = new Drink(250);
        menu.addDish(cocktail);
        menu.printDescription();

    }

}
