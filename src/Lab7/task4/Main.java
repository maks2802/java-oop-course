package Lab7.task4;

public class Main {
    public static void main(String[] args) {
        UserAccount user = new UserAccount("max", "1234");

        System.out.println("Username: " + user.getUsername());

        user.changePassword("1234", "securePass");
    }
}
