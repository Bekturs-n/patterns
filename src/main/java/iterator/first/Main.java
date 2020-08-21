package iterator.first;

/**
 * Имя: Итератор
 *
 * Группа: поведенческий
 *
 * Назначение: Предоставляет способ последовательного доступа ко всем элементам составного
 * объекта, не раскрывая его внутреннего представления.
 *
 * Другие названия: Cursor (курсор).
 *
 * Подробнее:
 * https://refactoring.guru/ru/design-patterns/iterator
 *
 * Литература:
 *  "Приемы объектно-ориентированного проектирования. Паттерны проектирования"- страница 249
 *
 * Java-example:
 * https://www.youtube.com/watch?v=yY6oy8xHLT8
 * https://refactoring.guru/ru/design-patterns/iterator/java/example
 */

public class Main {
    public static void main(String[] args) {
        String[] skills = {"Java", "JS", "Spring", "Maven"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Beka", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Dev: - " + javaDeveloper.getName());
        System.out.println("Skills:");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + "; ");
        }
    }
}
