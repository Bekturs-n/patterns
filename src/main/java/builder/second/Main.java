package builder.second;

public class Main {
    public static void main(String[] args) {
        Account account = Account.newBuilder()
                .setToken("hello")
                .setUserId("habr")
                .build();

        System.out.println(account);
    }
}