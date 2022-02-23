package ballup;

import com.ballup.UserPages.CourtPage;
import com.ballup.databaseMethods.*;
import com.ballup.spring.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BallUPApp {

    public static void main(String[] args){
        SpringApplication.run(BallUPApp.class,args);



        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Court court = context.getBean("courtBean",Court.class);
        CourtSQL.add(court);

        context.close();

    }
}
