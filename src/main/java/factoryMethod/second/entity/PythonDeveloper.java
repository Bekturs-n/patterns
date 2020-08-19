package factoryMethod.second.entity;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Я - " + this.getClass().getSimpleName() + ". Написать Python код!");
    }
}
