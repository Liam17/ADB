package ballup.databaseMethods;

import java.sql.*;
import java.util.ArrayList;

public class NotificationSQL {

    static String connectionUrl = "jdbc:sqlserver://ballupdb-launch.ckfktgt8sceo.us-east-2.rds.amazonaws.com:3306;databaseName=ballupdb-launch;user=admin;password=ballUP420";
    public static void add(Notification notif){

        try (
                Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String insert = "insert into Notifications (notificationID,profileID,postID,notificationType,taggerProfileID)" +
                    "values ("+notif.notificationID+","+notif.profileID+","+notif.postID
                    +","+notif.notificationType+","+notif.taggerProfileID+");";

            stmt.executeQuery(insert);

        }
        // Handle any errors that may have occurred.
        catch (
                SQLException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Notification> viewNotifications(int profileID){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlSelect = "select * from Notification where profileID = " + profileID + ")";
            ResultSet rs = stmt.executeQuery(sqlSelect);

            return Notification.sqlToNotification(rs);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void delete(int notificationID){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlDelete = "delete from Notification where notificationID = " + notificationID + ")";
            stmt.execute(sqlDelete);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
