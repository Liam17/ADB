package ballup.UserPages;
import com.ballup.databaseMethods.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


public class CourtPage {


    private String courtPageName;

    public CourtPage(String courtPageName){
        this.courtPageName = courtPageName;
    }

    public void setCourtPageName(String courtPageName) {
        this.courtPageName = courtPageName;
    }

    public void displayName(){
        System.out.println("page name:"+courtPageName);
    }



    /*
    @Autowired
    private Profile profile;



    public CourtPage(Court court, Profile profile){
        this.court=court;
        this.profile=profile;
    }


    @Bean
    public void addCourt(Court court){
        CourtSQL.add(court);
    }

    @Bean
    public Court getCourt(Court court) {
        return CourtSQL.viewCourt(court.getCourtID());
    }

    @Bean
    public void followCourt(Profile profile, Court court){
        CourtFollowerSQL.follow(new CourtFollower(profile.getProfileID(),court.getCourtID()));
    }

    @Bean
    public void deleteCourt(Court court){
        CourtSQL.delete(court.getCourtID());
    }

    @Bean
    public void updateCourt(Court court){
        CourtSQL.update(court.getCourtID(),court);
    }
*/


}
