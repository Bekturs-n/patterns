package templateMethod.first;

public abstract class WebsiteTemp {
    public void showPage(){
        System.out.println("Header");
        showContent();
        System.out.println("Footer");
    }

    public abstract void showContent();
}
