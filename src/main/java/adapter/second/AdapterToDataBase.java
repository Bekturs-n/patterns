package adapter.second;

public class AdapterToDataBase implements DataBase {

    JavaApplication application = new JavaApplication();

    @Override
    public void select() {
        application.loadObject();
    }

    @Override
    public void insert() {
        application.saveObject();
    }

    @Override
    public void update() {
        application.refreshObject();
    }

    @Override
    public void delete() {
        application.removeObject();
    }
}
