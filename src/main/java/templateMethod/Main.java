package templateMethod;

/**
 * Шаблонный метод — это поведенческий паттерн проектирования, который определяет скелет алгоритма,
 * перекладывая ответственность за некоторые его шаги на подклассы.
 * Паттерн позволяет подклассам переопределять шаги алгоритма, не меняя его общей структуры.
 *
 * Подробнее:
 * https://www.youtube.com/watch?v=MEeMRlaI3u8
 * https://refactoring.guru/ru/design-patterns/template-method
 *
 * Java-example:
 * https://www.youtube.com/watch?v=ib8HrjOkT-0
 * https://refactoring.guru/ru/design-patterns/template-method/java/example
 *
 */

public class Main {
    public static void main(String[] args) {
        WebsiteTemp helloPage = new HelloPage();
        WebsiteTemp welcomePage = new WelcomePage();

        welcomePage.showPage();
        System.out.println("\n*************************************\n");
        helloPage.showPage();
    }
}
