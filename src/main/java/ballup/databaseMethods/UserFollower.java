package ballup.databaseMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserFollower {

    int profileID;
    int followingID;

    public UserFollower(int profileID, int followingID) {
        this.profileID = profileID;
        this.followingID = followingID;
    }

    public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }

    public int getFollowingID() {
        return followingID;
    }

    public void setFollowingID(int followingID) {
        this.followingID = followingID;
    }

    public static ArrayList<UserFollower> sqlToUserFollower(ResultSet rs) throws SQLException {
        int profileID;
        int followingID;

        ArrayList<UserFollower> userFollowers = new ArrayList<>();

        while(rs.next()){
            userFollowers.add(new UserFollower(rs.getInt("profileID"),rs.getInt("followingID")));
        }

        return userFollowers;
    }
}
