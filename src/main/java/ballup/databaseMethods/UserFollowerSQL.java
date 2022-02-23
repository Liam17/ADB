package ballup.databaseMethods;

import java.sql.*;
import java.util.ArrayList;

public class UserFollowerSQL {

    static String connectionUrl = "jdbc:sqlserver://ballupdb-launch.ckfktgt8sceo.us-east-2.rds.amazonaws.com:3306;databaseName=ballupdb-launch;user=admin;password=ballUP420";
    public static void follow(UserFollower userFollower){

        try (
                Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String insert = "insert into UserFollower (profileID,followingID)" +
                    " values ("+userFollower.profileID+","+userFollower.followingID+");";

            stmt.executeQuery(insert);

        }
        // Handle any errors that may have occurred.
        catch (
                SQLException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<UserFollower> viewFollowers(int profileID){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlSelect = "select * from UserFollower where profileID = " + profileID + ")";
            ResultSet rs = stmt.executeQuery(sqlSelect);

            return UserFollower.sqlToUserFollower(rs);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void unfollow(UserFollower userFollower){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlDelete = "delete from UserFollower where profileID = " + userFollower.profileID + "and followingID = "+userFollower.followingID+");";
            stmt.execute(sqlDelete);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
