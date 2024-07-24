package examsy;

public class Login {

    public static boolean authenticateUser(String username, String password) {
        return (UserDetails.authenticateUser(username, password));
}

    public static boolean verify(String username, String password) {
        return UserDetails.userdetails.containsKey(username) && UserDetails.userdetails.get(username).equals(password);
    }
}