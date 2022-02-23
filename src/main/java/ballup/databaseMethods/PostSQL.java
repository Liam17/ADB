package ballup.databaseMethods;

import java.sql.*;
import java.util.ArrayList;

public class PostSQL {
    static String connectionUrl = "jdbc:sqlserver://ballupdb-launch.ckfktgt8sceo.us-east-2.rds.amazonaws.com:3306;databaseName=ballupdb-launch;user=admin;password=ballUP420";
    public static void add(Post post){

        try (
                Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String insert = "insert into Posts (profileID,postID,courtID,postType,description,body,props,shooter,cluth,handle,posterizer,shotCreator,rimProtector)" +
                    " values ("+post.profileID+","+post.postID+","+post.courtID+","+post.postType+","+post.description+","+post.body+","+post.props+","+post.shooter+","+post.clutch+","+post.handle+","+post.posterizer+","+post.shotCreator+","+post.rimProtector+");";

            stmt.executeQuery(insert);

        }
        // Handle any errors that may have occurred.
        catch (
                SQLException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Post> viewPosts(int courtID){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlSelect = "select * from Post where courtID = " + courtID + ")";
            ResultSet rs = stmt.executeQuery(sqlSelect);

            return Post.sqlToPost(rs);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void delete(int postID){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlDelete = "delete from Posts where postID = " + postID + ")";
            stmt.execute(sqlDelete);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(int postID, Post post){
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String sqlUpdate = "update Post set profileID = "+post.profileID+",postID="+post.postID+",courtID="+post.courtID+",postType="+post.postType+",description="+post.description+",body="+post.body+",props="+post.props+",shooter="+post.shooter+",clutch="+post.clutch+",handle="+post.handle+",posterizer="+post.posterizer+",shotCreator="+post.shotCreator+",rimProtector="+post.rimProtector+");";
            stmt.execute(sqlUpdate);

            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
