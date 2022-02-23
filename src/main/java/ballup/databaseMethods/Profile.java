package ballup.databaseMethods;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Profile {

    int profileID;
    int props;
    int checkins;
    int currentStatus;
    int shooter;
    int clutch;
    int handle;
    int posterizer;
    int shotCreator;
    int rimProtector;

    public Profile(int profileID, int props, int checkins, int currentStatus, int shooter, int clutch, int handle, int posterizer, int shotCreator, int rimProtector) {
        this.profileID = profileID;
        this.props = props;
        this.checkins = checkins;
        this.currentStatus = currentStatus;
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

    public int getProps() {
        return props;
    }

    public void setProps(int props) {
        this.props = props;
    }

    public int getCheckins() {
        return checkins;
    }

    public void setCheckins(int checkins) {
        this.checkins = checkins;
    }

    public int getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(int currentStatus) {
        this.currentStatus = currentStatus;
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

    public static Profile sqlToProfile(ResultSet rs) throws SQLException {
        int profileID = rs.getInt("postID");
        int checkins = rs.getInt("checkins");
        int currentStatus = rs.getInt("currentStatus");
        int props = rs.getInt("props");
        int shooter = rs.getInt("shooter");
        int clutch = rs.getInt("clutch");
        int handle = rs.getInt("handle");
        int posterizer = rs.getInt("posterizer");
        int shotCreator = rs.getInt("shotCreator");
        int rimProtector = rs.getInt("rimProtector");
        return new Profile(profileID,props,checkins,currentStatus,
                shooter,clutch,handle,posterizer,shotCreator,rimProtector);
    }
}
