package tests;

import data.SystemPostData;
import data.UserData;
import generators.DataGenerator;
import org.junit.Assert;

public class PostTest extends TestBase {

    private UserData testUser;
    private SystemPostData testPost;

    @Override
    public void testCase() {
        //UserData user = new UserData("admin", "admin");
        //SystemPostData systemPostData = new SystemPostData("text", "FAQ");
        app.getNavigationHelper().openPage();
        app.getNavigationHelper().setWindowSize();
        app.getLogInHelper().logIn(testUser);
        app.getPostHelper().newSystemPost(testPost);
        app.getLogInHelper().logOut();
        app.terminate();
        //Assert.assertEquals(systemPostData.text, app.getPostHelper().getCreatedPostData().text);
        //Assert.assertEquals(systemPostData.theme, app.getPostHelper().getCreatedPostData().theme);
    }

    @Override
    public void additionalSetup() {
        testUser = DataGenerator.readUser("user.json");
        testPost = DataGenerator.readPost("post.json");
    }
}
