package singleton.second.simple;

/**Пример создания Singleton и получения connection без учета многопоточки**/
public class DataBaseConnection {

    private static DataBaseConnection connection;

    private DataBaseConnection() {
    }

    public static DataBaseConnection createConnection(){
        if(connection == null){
            connection = new DataBaseConnection();
        }
        return connection;
    }

}
