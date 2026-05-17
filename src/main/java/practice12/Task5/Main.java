package practice12.Task5;

public class Main {

    public static void main(String[] args) {

        InventoryService invetoryService = new InventoryService();

        invetoryService.addProduct(new Product("Ноутбук", "Электроника", 69000));
        invetoryService.addProduct(new Product("Смартфон", "Электроника", 37900));
        invetoryService.addProduct(new Product("Планшет", "Электроника", 29999));
        invetoryService.addProduct(new Product("Клавиатура", "Периферия", 9000));
        invetoryService.addProduct(new Product("Мышь", "Периферия", 2900));

        invetoryService.printInventory();

        System.out.println("Получение товара категории Электроника: " + invetoryService.getProductByCategory("Электроника"));
        System.out.println("Поиск по категории Периферия: " + invetoryService.findProductByCategory("Периферия"));
        System.out.println("Фильтр по цене более 30 тысяч: " + invetoryService.filterByPrice(30000));

    }
}
