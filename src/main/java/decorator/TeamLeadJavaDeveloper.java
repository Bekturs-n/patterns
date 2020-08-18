package decorator;

public class TeamLeadJavaDeveloper extends Decorator{
    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "Send week report to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
