package practice5.task5;

//5. Ферма
//Условие:
//На ферме содержится одно домашнее животное.
//У каждого животного свои функции и нужды.
//Примеры:
//Корова даёт молоко, нуждается в выпасе
//Курица несёт яйца, требует зерно
//Нужно создать систему, которая позволяет управлять животным с учётом его потребностей.

public class Main {
    public static void main(String[] args) {

        Cow burenka = new Cow();
        Farm cowFarm = new Farm();

        cowFarm.addFarmAnimal(burenka);
        cowFarm.collectingProduce();
        cowFarm.feedFarmAnimal(); // убедимся, что наша корова не ест (по условиям данной задачи)

        Chicken ryaba = new Chicken();
        Farm chickenFarm = new Farm();

        chickenFarm.addFarmAnimal(ryaba);
        chickenFarm.feedFarmAnimal();
        chickenFarm.takeAWalk(); // проверяем что курицу не выводят на выпас (по условиям данной задачи)

    }
}
