package ballup.databaseMethods;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {

    int profileID;
    String firstName;
    String lastName;
    String username;
    String passcode;
    String bio;
    String homeCourt;
    String position;
    String postalCode;
    String email;

    public User(int profileID, String firstName, String lastName, String username, String passcode, String bio, String homeCourt, String position, String postalCode, String email) {
        this.profileID = profileID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.passcode = passcode;
        this.bio = bio;
        this.homeCourt = homeCourt;
        this.position = position;
        this.postalCode = postalCode;
        this.email = email;
    }

    public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getHomeCourt() {
        return homeCourt;
    }

    public void setHomeCourt(String homeCourt) {
        this.homeCourt = homeCourt;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static User sqlToUser(ResultSet rs) throws SQLException {
        int profileID = rs.getInt("profileID");
        String firstName = rs.getString("lastName");
        String lastName = rs.getString("lastName");
        String username = rs.getString("username");
        String passcode = rs.getString("passcode");
        String bio = rs.getString("bio");
        String homeCourt = rs.getString("homeCourt");
        String position = rs.getString("position");
        String postalCode = rs.getString("postalCode");
        String email = rs.getString("email");
        return new User(profileID,firstName,lastName,username,passcode,bio,homeCourt,position,postalCode,email);
    }
}
