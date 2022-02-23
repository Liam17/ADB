package ballup.UserPages;
import org.springframework.stereotype.Component;
import com.ballup.databaseMethods.*;


//@Component
public class UserPage {

    User user;

    public UserPage(User user) {
        this.user = user;
    }

    public void newUser(User user){
        UserSQL.add(user);
    }

    public User viewUser(int profileID){
        return UserSQL.viewUser(profileID);
    }

    public void deleteUser(int profileID){
        UserSQL.delete(profileID);
    }

    public void updateUser(int profileID, User newUser){
        UserSQL.update(profileID, newUser);
    }

}
