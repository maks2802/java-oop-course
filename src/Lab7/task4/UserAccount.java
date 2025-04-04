package Lab7.task4;

public class UserAccount {
    private String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void login(String enteredPassword) {
        if (this.password.equals(enteredPassword)) {
            System.out.println("Успішний вхід.");
        } else {
            System.out.println("Невірний пароль.");
        }
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Пароль успішно змінено");
        } else {
            System.out.println("Невірний старий пароль");
        }
    }
}
