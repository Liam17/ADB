package ballup.databaseMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CourtFollower {

    int courtID;
    int profileID;

    public CourtFollower(int courtID, int profileID){
        this.courtID=courtID;this.profileID=profileID;
    }

    public int getCourtID() {
        return courtID;
    }

    public void setCourtID(int courtID) {
        this.courtID = courtID;
    }

    public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }

    public static ArrayList<CourtFollower> sqlToCourtFollower(ResultSet rs) throws SQLException {

        int courtID;
        int profileID;

        ArrayList<CourtFollower> courtFollowers = new ArrayList<>();

        while(rs.next()){
            courtFollowers.add(new CourtFollower(rs.getInt("courtID"),rs.getInt("profileID")));
        }

        return courtFollowers;
    }
}

