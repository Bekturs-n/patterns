package adapter;

/***
 * Адаптер — это структурный паттерн проектирования,
 * который позволяет объектам с несовместимыми интерфейсами работать вместе.
 *
 * Подробнее:
 * https://refactoring.guru/ru/design-patterns/adapter
 *
 * Java-example:
 */

public class Main {
    public static void main(String[] args) {
        SomeInterface someInterface = new Adapter();
        someInterface.create();
        someInterface.update();
        someInterface.select();
        someInterface.delete();
    }
}
