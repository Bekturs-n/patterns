package builder.first;

import builder.first.builder.Director;
import builder.first.builder.*;

/***
 * Строитель — это порождающий паттерн проектирования, который позволяет создавать сложные объекты пошагово.
 * Строитель даёт возможность использовать один и тот же код строительства для получения разных представлений объектов.
 *
 * Подробнее:
 * https://refactoring.guru/ru/design-patterns/builder
 *
 * Java-example:
 * https://refactoring.guru/ru/design-patterns/builder/java/example
 */

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

    }
}
