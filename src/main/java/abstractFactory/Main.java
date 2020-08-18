package abstractFactory;

import abstractFactory.pack.factory.CarFactory;
import abstractFactory.pack.factory.MercFactory;

/***
 *      Абстрактная фабрика — это порождающий паттерн проектирования,
 *      который позволяет создавать семейства связанных объектов,
 *      не привязываясь к конкретным классам создаваемых объектов.
 *
 *      Подробнее:
 *      https://refactoring.guru/ru/design-patterns/abstract-factory
 *      https://habr.com/ru/post/465835/
 *
 *      Java-example:
 *      https://refactoring.guru/ru/design-patterns/abstract-factory/java/example
 */

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new MercFactory();
        System.out.println(factory.createCoupe());
    }
}
