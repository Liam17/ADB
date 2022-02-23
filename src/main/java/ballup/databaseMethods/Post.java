package ballup.databaseMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Post {
    int profileID;
    int postID;
    int courtID;
    String postType;
    String description;
    String body;
    int props;
    int shooter;
    int clutch;
    int handle;
    int posterizer;
    int shotCreator;
    int rimProtector;

    public Post(int profileID, int postID, int courtID, String postType, String description, String body, int props, int shooter, int clutch, int handle, int posterizer, int shotCreator, int rimProtector) {
        this.profileID = profileID;
        this.postID = postID;
        this.courtID = courtID;
        this.postType = postType;
        this.description = description;
        this.body = body;
        this.props = props;
        this.shooter = shooter;
        this.clutch = clutch;
        this.handle = handle;
        this.posterizer = posterizer;
        this.shotCreator = shotCreator;
        this.rimProtector = rimProtector;
    }

    public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getCourtID() {
        return courtID;
    }

    public void setCourtID(int courtID) {
        this.courtID = courtID;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getProps() {
        return props;
    }

    public void setProps(int props) {
        this.props = props;
    }

    public int getShooter() {
        return shooter;
    }

    public void setShooter(int shooter) {
        this.shooter = shooter;
    }

    public int getClutch() {
        return clutch;
    }

    public void setClutch(int clutch) {
        this.clutch = clutch;
    }

    public int getHandle() {
        return handle;
    }

    public void setHandle(int handle) {
        this.handle = handle;
    }

    public int getPosterizer() {
        return posterizer;
    }

    public void setPosterizer(int posterizer) {
        this.posterizer = posterizer;
    }

    public int getShotCreator() {
        return shotCreator;
    }

    public void setShotCreator(int shotCreator) {
        this.shotCreator = shotCreator;
    }

    public int getRimProtector() {
        return rimProtector;
    }

    public void setRimProtector(int rimProtector) {
        this.rimProtector = rimProtector;
    }

    public static ArrayList<Post> sqlToPost(ResultSet rs) throws SQLException {
        int profileID;
        int postID;
        int courtID;
        String postType;
        String description;
        String body;
        int props;
        int shooter;
        int clutch;
        int handle;
        int posterizer;
        int shotCreator;
        int rimProtector;

        ArrayList<Post> posts = new ArrayList<>();

        while(rs.next()) {
            posts.add(new Post(rs.getInt("postID"), rs.getInt("profileID"), rs.getInt("courtID"), rs.getString("postType"),
                    rs.getString("description"), rs.getString("body"), rs.getInt("props"), rs.getInt("shooter"), rs.getInt("clutch"),
                    rs.getInt("handle"), rs.getInt("posterizer"), rs.getInt("shotCreator"), rs.getInt("rimProtector")));
        }
        return posts;
    }
}
