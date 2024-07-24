package examsy;
import java.util.*;
public class UserDetails {
    public static  final Map<String,String> userdetails=new HashMap<>();

    public static boolean authenticateUser(String username, String password){
        userdetails.put(username,password);
        return true;
    
}
}
