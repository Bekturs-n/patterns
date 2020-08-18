package decorator.first;

public class Decorator implements Developer{
    Developer developer;

    public Decorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
