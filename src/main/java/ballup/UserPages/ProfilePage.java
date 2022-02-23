package ballup.UserPages;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import com.ballup.databaseMethods.*;

//@Component
public class ProfilePage {

    Profile profile;

    public ProfilePage(Profile profile){
        this.profile=profile;
    }

    public void createProfile(Profile profile){
        ProfileSQL.add(profile);
    }

    public Profile viewProfile(int profileID){
        return ProfileSQL.viewProfile(profileID);
    }

    public void deleteProfile(int profileID){
        ProfileSQL.delete(profileID);
    }

    public void updateProfile(int profileID, Profile newProfile){
        ProfileSQL.update(profileID,newProfile);
    }

    public void newNotification(Notification notification){
        NotificationSQL.add(notification);
    }

    public ArrayList<Notification> viewNotifications(int profileID){
        return NotificationSQL.viewNotifications(profileID);
    }

    public void deleteNotification(int notificationID){
        NotificationSQL.delete(notificationID);
    }

    public void followerNewUser(int profileID, int followingID){
        UserFollowerSQL.follow(new UserFollower(profileID,followingID));
    }

    public ArrayList<UserFollower> viewFollowers(int profileID){
        return UserFollowerSQL.viewFollowers(profileID);
    }

    public void unfollow(int profileID, int followingID){
        UserFollowerSQL.unfollow(new UserFollower(profileID,followingID));
    }

}
