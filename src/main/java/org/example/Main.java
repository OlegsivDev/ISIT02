package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        Shop shop = new Shop(new LinkedList<Employee>(), new LinkedList<Product>(), new Storage());
//
//        shop.addProduct(new Product("Milk Babaevskoe", "Voronezh Milk Zavod", Generator.getCurrentDate(), Generator.getRandomDate(), 10, 100));
//        shop.takeProductByName("Milk Babaevskoe", 3);
//        EventLogic logic = new EventLogic(shop);
//        logic.addRandomEvent();
//        logic.addRandomEvent();
//        logic.addRandomEvent();
//        logic.runNextEvent();
//        logic.runNextEvent();
//        logic.runNextEvent();
//        shop.printAllProducts();

        Shop shop = new Shop(new LinkedList<Employee>(), new LinkedList<Product>(), new Storage());
        EventLogic logic = new EventLogic(shop);
        for (int i = 0; i<10; i++) {
            logic.addRandomEvent();
            logic.runNextEvent();
        }
        shop.printAllProducts();
    }

    /*
    TODO: Список задач
       +1. Class events, генерация случайного eventa из списка доступных в очередь событий
       +2. Добавить событие завоз товаров на склад
       +3. В классе Main прописать логику приложения (Тестирования как работают события)
        4. Добавить событие перевод товаров со склада в торговый зал
        5. Дабавить событие покупка товара покупателем
        6. Добавить событие Ликвидация просроченных товаров
        7. Добавить событие установка скидки на товар
        8. Реализовать чтобы товары могли быть штучными и вообще разными
        9. Вернуть тесты для StorageTest
     */
}