package ballup.databaseMethods;

import java.sql.*;

public class UserSQL {
    static String connectionUrl = "jdbc:sqlserver://ballupdb-launch.ckfktgt8sceo.us-east-2.rds.amazonaws.com:3306;databaseName=ballupdb-launch;user=admin;password=ballUP420";

    public static void add(User user){

        try (
                Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String insert = "insert into Users (profileID,firstName,lastName,username,passcode,bio,homeCourt,position,postalCode,email)" +
                    " values ("+user.profileID+","+user.firstName+","+user.lastName+","+user.username+","+user.passcode+","+user.bio+","+user.homeCourt+","+user.position+","+user.postalCode+","+user.email+");";

            stmt.executeQuery(insert);

        }
        // Handle any errors that may have occurred.
        catch (
                SQLException e) {
            e.printStackTrace();
        }

    }

    public static User viewUser(int profileID){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlSelect = "select * from Users where profileID = " + profileID + ")";
            ResultSet rs = stmt.executeQuery(sqlSelect);

            return User.sqlToUser(rs);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void delete(int profileID){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlDelete = "delete from Users where profileID = " + profileID + ")";
            stmt.execute(sqlDelete);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(int profileID, User newUser){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlUpdate = "update Users set profileID = "+newUser.profileID+",firstName="+ newUser.firstName+",lastName="+ newUser.lastName+",username="+newUser.username+",passcode="+ newUser.passcode+",bio="+ newUser.bio+",homeCourt="+ newUser.homeCourt+",position="+ newUser.position+",postalCode="+ newUser.postalCode+",email="+ newUser.email +");";
            stmt.execute(sqlUpdate);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
