package practice5.task7;

//7. Парк развлечений
//Условие:
//В парке есть аттракцион, каждый из которых предлагает свои ощущения и требует обслуживания.
//Примеры:
//Американские горки — проверка безопасности
//Карусель — техническое обслуживание
//Нужно создать систему, которая управляет аттракционом и выводит информацию для посетителей.

import practice5.task6.Cactus;

public class Main {
    public static void main(String[] args) {

        ParkOfAttractions newPark = new ParkOfAttractions();
        Carusel carusel = new Carusel();

        newPark.addAttraction(carusel);
        newPark.service();
        newPark.printInfo();

        ParkOfAttractions coasterPark = new ParkOfAttractions();
        RollerCoaster coaster = new RollerCoaster();

        coasterPark.addAttraction(coaster);
        coasterPark.service();
        coasterPark.printInfo();

    }
}
