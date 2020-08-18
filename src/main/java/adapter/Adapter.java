package adapter;

public class Adapter extends SomeClass implements SomeInterface {

//    Вместо наследования можно обойтить и композицией
//    SomeClass someClass = new SomeClass();

    @Override
    public void create() {
        createObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        selectObject();
    }

    @Override
    public void delete() {
        deletingObject();
    }
}
