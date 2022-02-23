package ballup.databaseMethods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Court {
    int courtID;
    String courtName;
    float rating;
    String courtAddress;
    int followers;
    float hypeLevel;
    int numHoops;
    boolean pickUp;
    boolean lights;
    int intensity;
    int numReviews;

    public Court(int courtID, String courtName, float rating, String courtAddress, int followers,
          float hypeLevel, int numHoops, boolean pickUp, boolean lights, int intensity,int numReviews){
        this.courtID=courtID;this.courtName=courtName;this.rating=rating;this.courtAddress=courtAddress;
        this.followers=followers;this.hypeLevel=hypeLevel;this.numHoops=numHoops;this.pickUp=pickUp;
        this.lights=lights;this.intensity=intensity;this.numReviews=numReviews;
    }

    public int getCourtID() {
        return courtID;
    }

    public void setCourtID(int courtID) {
        this.courtID = courtID;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getCourtAddress() {
        return courtAddress;
    }

    public void setCourtAddress(String courtAddress) {
        this.courtAddress = courtAddress;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public float getHypeLevel() {
        return hypeLevel;
    }

    public void setHypeLevel(float hypeLevel) {
        this.hypeLevel = hypeLevel;
    }

    public int getNumHoops() {
        return numHoops;
    }

    public void setNumHoops(int numHoops) {
        this.numHoops = numHoops;
    }

    public boolean isPickUp() {
        return pickUp;
    }

    public void setPickUp(boolean pickUp) {
        this.pickUp = pickUp;
    }

    public boolean isLights() {
        return lights;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public int getNumReviews() {
        return numReviews;
    }

    public void setNumReviews(int numReviews) {
        this.numReviews = numReviews;
    }

    public static ArrayList<Court> sqlToCourt(ResultSet rs) throws SQLException {
        int courtID;
        String courtName;
        float rating;
        String courtAddress;
        int followers;
        float hypeLevel;
        int numHoops;
        boolean pickUp;
        boolean lights;
        int intensity;
        int numReviews;

        ArrayList<Court> courts = new ArrayList<>();

        while(rs.next()){

            courts.add(new Court(rs.getInt("courtID"),rs.getString("courtName"),rs.getFloat("rating")
            ,rs.getString("courtAddress"),rs.getInt("followers"),rs.getFloat("hypeLevel"),rs.getInt("numHoops"),
                    rs.getBoolean("pickUp"),rs.getBoolean("lights"),rs.getInt("intensity"),rs.getInt("numReviews")));

        }

        return courts;
    }
}
