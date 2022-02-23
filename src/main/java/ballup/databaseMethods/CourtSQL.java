package ballup.databaseMethods;

import java.sql.*;
import java.util.ArrayList;

public class CourtSQL {

    static String connectionUrl = "jdbc:sqlserver://servername=ballupdb-launch.ckfktgt8sceo.us-east-2.rds.amazonaws.com:3306;databaseName=ballupdb-launch;user=admin;password=ballUP420";
    public static void add(Court court){

        try (
                Connection con = DriverManager.getConnection(connectionUrl);
                Connection con2 = DriverManager.getConnection(connectionUrl);
                Statement stmt = con.createStatement();) {
            System.out.println("made it here");
            String insert = "insert into Court (courtID,courtName,rating,courtAddress,followers,hypeLevel,numHoops,pickUp,lights,intensity,numReviews)" +
                    " values ("+court.getCourtID()+","+court.getCourtName()+","+court.getRating()+","+court.getCourtAddress()+","+court.getFollowers()+","+court.getHypeLevel()+","+court.getNumHoops()+","+court.isPickUp()+","+court.isLights()+","+court.getIntensity()+","+court.getNumReviews()+");";
            stmt.execute(insert);
            System.out.println("here too");

        }
        // Handle any errors that may have occurred.
        catch (
                SQLException e) {
            e.printStackTrace();
        }

    }

    public static Court viewCourt(int courtID){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlSelect = "select * from Court where courtID = " + courtID + ")";
            ResultSet rs = stmt.executeQuery(sqlSelect);

            return (Court.sqlToCourt(rs)).get(0);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static ArrayList<String> seeAllCourtNames(){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlSelect = "select courtName from Court)";
            ResultSet rs = stmt.executeQuery(sqlSelect);

            ArrayList<String> courtNames = new ArrayList<>();
            while (rs.next()) {
                courtNames.add(rs.getString("courtName")) ;
            }
            return courtNames;

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void delete(int courtID){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlDelete = "delete from Court where courtID = " + courtID + ")";
            stmt.execute(sqlDelete);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(int courtID, Court newCourt){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlUpdate = "update Court set courtID = "+newCourt.getCourtID()+",courtName="+newCourt.getCourtName()+",rating="+newCourt.getRating()+",courtAddress="+newCourt.getCourtAddress()+",followers="+newCourt.getFollowers()+",hypeLeve="+newCourt.getHypeLevel()+",numHoops="+newCourt.getNumHoops()+",pickUp="+newCourt.isPickUp()+",lights="+newCourt.isLights()+",intensity="+newCourt.getIntensity()+",numReviews="+newCourt.getNumReviews()+"where courtID = "+courtID+")";
            stmt.execute(sqlUpdate);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
