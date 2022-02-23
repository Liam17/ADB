package ballup.UserPages;
import org.springframework.stereotype.Component;
import com.ballup.databaseMethods.*;

//@Component
public class SocialPage {
    Profile profile;

    public SocialPage(Profile profile) {
        this.profile=profile;
    }

    public void newPost(Post post){
        PostSQL.add(post);
    }

    public void deletePost(int postID){
        PostSQL.delete(postID);
    }

    public void updatePost(int postID, Post newPost){
        PostSQL.update(postID,newPost);
    }

}
