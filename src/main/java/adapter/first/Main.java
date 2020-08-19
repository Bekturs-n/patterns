package adapter.first;

/***
 * Адаптер — это структурный паттерн проектирования,
 * который позволяет объектам с несовместимыми интерфейсами работать вместе.
 * Адаптер выступает прослойкой между двумя объектами, превращая вызовы одного в вызовы понятные другому.
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
