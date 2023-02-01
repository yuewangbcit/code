package code.inheritance.introToInheritance.messages;

import java.util.ArrayList;
import java.util.Random;

/**
 * Stores news posts for the news feed in a
 * social network application (like FaceBook or Google+).
 * 
 * Display of the posts is currently simulated by printing the
 * details to the terminal.
 * 
 * @author  BCIT Based on code by the authors of BlueJ
 * @version 2020
 */
public class NewsFeed
{
    private ArrayList<Post> posts;

    /**
     * Constructs an empty news feed.
     */
    public NewsFeed()
    {
        posts = new ArrayList<Post>();
    }

    /**
     * Adds a post to the news feed.
     * 
     * @param post  The post to be added.
     */
    public void addPost(Post post)
    {
        posts.add(post);
    }

    /**
     * Shows the news feed. Currently: print the news feed details
     * to the terminal. (To do: replace this later with display
     * in web browser.)
     */
    public void show()
    {
        for(Post post : posts) {
            post.display();
            System.out.println();
        }
    }
    
    /**
     * Drives the program.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
        NewsFeed myNewsFeed = new NewsFeed();
        Random random = new Random();
        
        for (int i = 0; i < 5; ++i) {
            myNewsFeed.addPost(new Post("Chris Post"));
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myNewsFeed.addPost(new MessagePost("Chris MessagePost", "I like spaghetti too!"));
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myNewsFeed.addPost(new PhotoPost("Chris PhotoPost", "photo" + i, "Look at all the spaghetti!"));
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        myNewsFeed.show();
    }
}
