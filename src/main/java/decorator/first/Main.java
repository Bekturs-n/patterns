package decorator.first;

/**
 * Паттерн "Декоратор"
 *
 * Группа: структурный
 *
 * Декоратор — это структурный паттерн, который позволяет добавлять
 * объектам новые поведения на лету, помещая их в объекты-обёртки.
 *
 * Подробнее:
 * https://refactoring.guru/ru/design-patterns/decorator
 *
 * Java-example:
 * https://www.youtube.com/watch?v=2aB2B3b3bQA
 */
public class Main {
    public static void main(String[] args) {
        Developer developer = new TeamLeadJavaDeveloper(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
