package singleton.second.simple;

/**
 * https://refactoring.guru/ru/design-patterns/singleton/java/example
 */
public class Main {

    public static void main(String[] args) {
        DataBaseConnection connection = DataBaseConnection.createConnection();
        System.out.println(connection.toString());

        DataBaseConnection newConnection = DataBaseConnection.createConnection();
        System.out.println(newConnection.toString());
    }
}
