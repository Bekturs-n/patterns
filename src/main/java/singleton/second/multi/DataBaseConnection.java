package singleton.second.multi;

/**Пример создания Singleton и получения connection для многопоточной программы**/
public class DataBaseConnection {

    private static volatile DataBaseConnection connection;

    private DataBaseConnection() {
    }

    public static DataBaseConnection createConnection(){
        synchronized (DataBaseConnection.class) {
            if (connection == null) {
                connection = new DataBaseConnection();
            }
            return connection;
        }
    }

}
