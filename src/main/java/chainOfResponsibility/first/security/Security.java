package chainOfResponsibility.first.security;

public abstract class Security {
    private Security next;

    public Security linkWith(Security next){
        this.next =  next;
        return next;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
