package decorator.first;

public class SeniorJavaDeveloper extends Decorator{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
