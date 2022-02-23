package ballup.config;

import com.ballup.UserPages.CourtPage;
import com.ballup.databaseMethods.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
 // LOOKS LIKE SPRING, PROBABLY A TRASH CLASS
@RestController
public class HomeController {

    CourtPage courtPage;

    @GetMapping("/")
    public void doesitwork(){
    }
}
