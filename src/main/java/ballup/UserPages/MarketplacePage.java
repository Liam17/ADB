package ballup.UserPages;
import com.ballup.databaseMethods.*;
import org.springframework.stereotype.Component;

//@Component
public class MarketplacePage {

    // post object will be different from ad, need new database


    Profile profile;

    public MarketplacePage(Profile profile) {
        this.profile = profile;
    }

    public void newAd(Post post){
        PostSQL.add(post);
    }

    public void deleteAd(int postID){
        PostSQL.delete(postID);
    }

    public void updateAd(int postID, Post newPost){
        PostSQL.update(postID,newPost);
    }
    /*
    public ArrayList<Ad> viewAds(profile ID){

    }
    */
}
