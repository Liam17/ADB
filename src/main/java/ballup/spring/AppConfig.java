package ballup.spring;

import com.ballup.UserPages.CourtPage;
import com.ballup.databaseMethods.Court;
import com.ballup.databaseMethods.Profile;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "java")
public class AppConfig {

/*    @Bean
    public CourtPage courtPageBean(){
        CourtPage courtPage = new CourtPage("fkjldasjfl");
        System.out.println("beepboop");
        courtPage.displayName();
        return courtPage;
    }*/

    @Bean
    public Court courtBean(){
        return new Court(1,"ramsden",8,"the park",1,10,4,true,false,7,0);
    }


}
