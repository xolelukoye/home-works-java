package practice12.Task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * InventoryService: Сервис для управления товарами на складе. Должен поддерживать операции добавления товара и извлечения товара по категории.
 * Управление товарными запасами:
 * Хранение товаров осуществляется в структуре Map<String, List<Product>>, где ключ - это категория товара.
 * Метод для добавления товара на склад. Если флаг isInventoryOpen равен false, операция добавления не должна выполняться.
 * Метод для получения товара по категории. Если в указанной категории нет товаров, должно выбрасываться исключение OutOfStockException.
 * Работа с данными:
 * Использование Stream API для поиска и фильтрации товаров по категориям.
 * Фильтрация товаров по цене с использованием лямбда-выражений.
 */

public class InventoryService {

    private Map<String, List<Product>> inventory = new HashMap<>();
    private boolean isInventoryOpen = true;

    public void setInventoryOpen(boolean inventoryOpen) {
        isInventoryOpen = inventoryOpen;
    }

    public void addProduct(Product product) {
        if (!isInventoryOpen) {
            System.out.println("Доступ к сладу закрыт, добавить товар невозможно");
            return;
        }

        inventory.computeIfAbsent(product.getCategory(), k -> new ArrayList<>()).add(product);
    }

    public Product getProductByCategory(String category) {
        List<Product> products = inventory.get(category);

        if (products == null || products.isEmpty()) {
            throw new OutOfStockException("Товары из категории " + category + " закончились");
        }

        return products.remove(0);
    }

    public List<Product> findProductByCategory(String category) {
        return inventory.values().stream().flatMap(List::stream)
                .filter(product -> product.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public List<Product> filterByPrice(double minPrice) {
        return inventory.values().stream().flatMap(List::stream)
                .filter(product -> product.getPrice() >= minPrice)
                .collect(Collectors.toList());
    }

    public void printInventory() {
        inventory.forEach((category, products) -> {
            System.out.println(category + ": " + products);
        });
    }
}
