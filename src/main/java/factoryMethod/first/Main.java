package factoryMethod.first;

import factoryMethod.first.factory.MSIFactory;
import factoryMethod.first.factory.MacFactory;
import factoryMethod.first.factory.NotebookFactory;
import factoryMethod.first.product.Notebook;

/***
 * Фабричный метод — это порождающий паттерн проектирования, который определяет
 * общий интерфейс для создания объектов в суперклассе, позволяя подклассам изменять тип создаваемых объектов.
 *
 * Подробнее:
 * https://refactoring.guru/ru/design-patterns/factory-method
 *
 * Java-example:
 * https://refactoring.guru/ru/design-patterns/factory-method/java/example
 */

public class Main {
    public static void main(String[] args) {
        NotebookFactory msiFactory = new MSIFactory();
        NotebookFactory macFactory = new MacFactory();

        Notebook mac = macFactory.creator();
        Notebook msi = msiFactory.creator();

        System.out.println(mac.toString());
        System.out.println(msi.toString());
    }
}
