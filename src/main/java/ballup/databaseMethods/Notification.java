package ballup.databaseMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Notification {
    int notificationID;
    int postID;
    int profileID;
    int notificationType;
    int taggerProfileID;

    Notification(int notificationID, int profileID, int postID, int notificationType, int taggerProfileID){
        this.profileID=profileID;this.postID=postID;this.notificationType=notificationType;
        this.taggerProfileID=taggerProfileID;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }

    public int getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(int notificationType) {
        this.notificationType = notificationType;
    }

    public int getTaggerProfileID() {
        return taggerProfileID;
    }

    public void setTaggerProfileID(int taggerProfileID) {
        this.taggerProfileID = taggerProfileID;
    }

    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public static ArrayList<Notification> sqlToNotification(ResultSet rs) throws SQLException {
        int notificationID;
        int postID;
        int profileID;
        int notificationType;
        int taggerProfileID;

        ArrayList<Notification> notifs = new ArrayList<>();
        while(rs.next()){
            notifs.add(new Notification(rs.getInt("notificationID"),rs.getInt("profileID"),rs.getInt("postID"),rs.getInt("notificationType"),rs.getInt("taggerProfileID")));
        }

        return notifs;
    }
}
