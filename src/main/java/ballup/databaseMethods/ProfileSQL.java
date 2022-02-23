package ballup.databaseMethods;

import java.sql.*;

public class ProfileSQL {

    static String connectionUrl = "jdbc:sqlserver://ballupdb-launch.ckfktgt8sceo.us-east-2.rds.amazonaws.com:3306;databaseName=ballupdb-launch;user=admin;password=ballUP420";
    public static void add(Profile profile){

        try (
                Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String insert = "insert into Profile (profileID,shooter,cluth,handle,posterizer,shotCreator,rimProtector)" +
                    " values ("+profile.profileID+","+profile.shooter+","+profile.clutch+","+profile.handle+","+profile.posterizer+","+profile.shotCreator+","+profile.rimProtector+");";

            stmt.executeQuery(insert);

        }
        // Handle any errors that may have occurred.
        catch (
                SQLException e) {
            e.printStackTrace();
        }

    }

    public static Profile viewProfile(int profileID){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlSelect = "select * from Profile where profileID = " + profileID + ")";
            ResultSet rs = stmt.executeQuery(sqlSelect);

            return Profile.sqlToProfile(rs);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void delete(int profileID){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlDelete = "delete from Profile where profileID = " + profileID + ")";
            stmt.execute(sqlDelete);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(int profileID, Profile profile){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlUpdate = "update Profile set profileID = "+profile.profileID+",props="+profile.props+",shooter="+profile.shooter+",clutch="+profile.clutch+",handle="+profile.handle+",posterizer="+profile.posterizer+",shotCreator="+profile.shotCreator+",rimProtector="+profile.rimProtector+");";
            stmt.execute(sqlUpdate);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
