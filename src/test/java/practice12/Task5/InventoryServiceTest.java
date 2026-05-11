package practice12.Task5;

/*
positive cases:
    добавление товара -> добавление+поиск
    извлечение товара -> добавление+извлечение
    удаление товара -> извлечение+поиск
    поиск по категории -> не изменяет состояние
    фильтрация по цене -> добавление+фильтрация
    добавлять несколько товаров в категорию
negative cases:
    добавление товара (закрытый склад)
    извлечение товара из пустой категории
    поиск товаров в несуществующей категории
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class InventoryServiceTest {

    private InvetoryService invetoryService;
    private  Product cleaner;
    private Product hairdryer;

    @BeforeEach
    void setUp() {
        invetoryService = new InvetoryService();
        cleaner = new Product("Пылесос", "Бытовая техника", 6000);
        hairdryer = new Product("Фен", "Бытовая техника", 32000);
    }

    @Test
    @DisplayName("Добавление товара")
    void addProductWhenInventoryOpen() {
        invetoryService.addProduct(cleaner);

        List<Product> products = invetoryService.findProductByCategory("Бытовая техника");
        assertEquals(1, products.size());
        assertEquals("Пылесос", products.get(0).getName());
    }

    @Test
    @DisplayName("Добавление нескольких товаров в одну категорию")
    void addMultipleProductsToSameCategory() {
        invetoryService.addProduct(cleaner);
        invetoryService.addProduct(hairdryer);

        List<Product> products = invetoryService.findProductByCategory("Бытовая техника");
        assertEquals(2, products.size());
    }

    @Test
    @DisplayName("Извлечение товара")
    void getProduct() {
        invetoryService.addProduct(cleaner);

        Product extracted = invetoryService.getProductByCategory("Бытовая техника");

        assertNotNull(extracted);
        assertEquals("Пылесос", extracted.getName());
    }

    @Test
    @DisplayName("Удаление товара при извлечении")
    void getProductShouldRemoveFromInventory() {
        invetoryService.addProduct(cleaner);
        invetoryService.addProduct(hairdryer);

        invetoryService.getProductByCategory("Бытовая техника");

        List<Product> remaining = invetoryService.findProductByCategory("Бытовая техника");
        assertEquals(1, remaining.size());
        assertEquals("Фен", remaining.get(0).getName());
    }

    @Test
    @DisplayName("Извлечение товара из пустой категории")
    void shouldThrowExceptionWhenCategoryEmpty() {
        assertThrows(OutOfStockException.class, () -> {
            invetoryService.getProductByCategory("Бытовая техника");
        });
    }

    @Test
    @DisplayName("Нельзя добавить товар, если склад закрыт")
    void shouldNotAddProductWhenInventoryClosed() {
        invetoryService.setInventoryOpen(false);
        invetoryService.addProduct(cleaner);

        List<Product> products = invetoryService.findProductByCategory("Бытовая техника");
        assertTrue(products.isEmpty());
    }

    @Test
    @DisplayName("Фильтрация товара по цене")
    void filterProductByPrice() {
        invetoryService.addProduct(cleaner);
        invetoryService.addProduct(hairdryer);

        List<Product> filtered = invetoryService.filterByPrice(10000);

        assertEquals(1, filtered.size());
        assertEquals("Фен", filtered.get(0).getName());
    }

    @Test
    @DisplayName("Поиск товара не изменяет состояние")
    void findShouldNotModifyInventory() {
        invetoryService.addProduct(cleaner);

        invetoryService.findProductByCategory("Бытовая техника");
        invetoryService.findProductByCategory("Бытовая техника");

        List<Product> remaining = invetoryService.findProductByCategory("Бытовая техника");

        assertEquals(1, remaining.size());
    }
}
