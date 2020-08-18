package chainOfResponsibility.first;

import chainOfResponsibility.first.security.RoleCheckSecurity;
import chainOfResponsibility.first.security.Security;
import chainOfResponsibility.first.security.ThrottlingSecurity;
import chainOfResponsibility.first.security.UserExistsSecurity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Цепочка обязанностей — это поведенческий паттерн проектирования, который позволяет передавать
 * запросы последовательно по цепочке обработчиков. Каждый последующий обработчик решает,
 * может ли он обработать запрос сам и стоит ли передавать запрос дальше по цепи.
 *
 * Подробнее:
 * https://refactoring.guru/ru/design-patterns/chain-of-responsibility
 *
 * Java-example:
 * https://refactoring.guru/ru/design-patterns/chain-of-responsibility/java/example
 *
 */
public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // Проверки связаны в одну цепь. Клиент может строить различные цепи,
        // используя одни и те же компоненты.
        Security security = new ThrottlingSecurity(2);
        security.linkWith(new UserExistsSecurity(server))
                .linkWith(new RoleCheckSecurity());

        // Сервер получает цепочку от клиентского кода.
        server.setSecurity(security);
    }
    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
