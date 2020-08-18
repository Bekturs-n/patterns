package iterator;

/**
 * Итератор — это поведенческий паттерн проектирования, который даёт возможность последовательно обходить
 * элементы составных объектов, не раскрывая их внутреннего представления.
 * <p>
 * Подробнее:
 * https://refactoring.guru/ru/design-patterns/iterator
 * <p>
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
