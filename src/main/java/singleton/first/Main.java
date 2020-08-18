package singleton.first;

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance1();
//      случайное чилсо от 0 до 100
        s.setId((long) (Math.random() * 100));
        System.out.println(s.getClass().getName() + " " + s.getId());
        Singleton s1 = Singleton.getInstance1();
        System.out.println(s1.getClass().getName() + " " + s1.getId());
    }
}
