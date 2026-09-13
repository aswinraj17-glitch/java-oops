class LoginAccount {
    private String username = "aswin";
    private String password = "1234";
    void login(String user, String pass) {
        if (username.equals(user) && password.equals(pass)) System.out.println("Login successful");
        else System.out.println("Invalid credentials");
    }
}
public class LoginSystem {
    public static void main(String[] args) {
        LoginAccount l = new LoginAccount();
        l.login("aswin", "1234"); l.login("aswin", "1111");
    }
}
