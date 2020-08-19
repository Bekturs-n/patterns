package factoryMethod.second.entity;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Я - " + this.getClass().getSimpleName() + ". Написать Java код!");
    }
}
