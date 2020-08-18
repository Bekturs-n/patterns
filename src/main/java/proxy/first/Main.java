package proxy.first;

/**
 * Заместитель — это объект, который выступает прослойкой между клиентом и реальным сервисным объектом.
 * Заместитель получает вызовы от клиента, выполняет свою функцию
 * (контроль доступа, кеширование, изменение запроса и прочее), а затем передаёт вызов сервисному объекту.
 *
 * Подробнее:
 * https://refactoring.guru/ru/design-patterns/proxy
 *
 * Java-example:
 * https://www.youtube.com/watch?v=EzDkgArMO3U
 */
public class Main {
    public static void main(String[] args) {
        Project project = new ProxyProject("some url");

        project.run();
    }
}
