package tracker;

public class UserStore {
    public static void main(String[] args) {
        User user = new User(1,"root","root");
        System.out.println("User: " + user.getId() + " "
        + user.getUsername() + " "
        + user.getPassword() + " ");
    }
}
