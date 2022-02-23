package ballup.databaseMethods;

import java.sql.*;
import java.util.ArrayList;

public class CourtFollowerSQL {

    static String connectionUrl = "jdbc:sqlserver://ballupdb-launch.ckfktgt8sceo.us-east-2.rds.amazonaws.com:3306;databaseName=ballupdb-launch;user=admin;password=ballUP420";
    public static void follow(CourtFollower courtFollower){

        try (
                Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String insert = "insert into CourtFollower (profileID,courtID) values ("+courtFollower.getProfileID()+","+courtFollower.getCourtID()+")";

            stmt.executeQuery(insert);

        }
        // Handle any errors that may have occurred.
        catch (
                SQLException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<CourtFollower> seeWhoFollows(int courtID){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlSelect = "select profileID from CourtFollower where courtID = " + courtID + ")";
            ResultSet rs = stmt.executeQuery(sqlSelect);
            ArrayList<CourtFollower> followers = new ArrayList<>();
            while (rs.next()) {
                followers.add(new CourtFollower(rs.getInt("profileID"),courtID)) ;
            }
            return followers;

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void unfollow(int courtID){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlDelete = "delete from CourtFollower where profileID = " + courtID + ")";
            stmt.execute(sqlDelete);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
