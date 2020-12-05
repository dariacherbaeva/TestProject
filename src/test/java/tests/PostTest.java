package tests;

import data.SystemPostData;
import data.UserData;
import org.junit.Assert;

public class PostTest extends TestBase {
    @Override
    public void testCase() {
        UserData user = new UserData("admin", "admin");
        SystemPostData systemPostData = new SystemPostData("text", "FAQ");
        app.getNavigationHelper().openPage();
        app.getNavigationHelper().setWindowSize();
        app.getLogInHelper().logIn(user);
        app.getPostHelper().newSystemPost(systemPostData);
        app.getLogInHelper().logOut();
        app.terminate();
        //Assert.assertEquals(systemPostData.text, app.getPostHelper().getCreatedPostData().text);
        //Assert.assertEquals(systemPostData.theme, app.getPostHelper().getCreatedPostData().theme);
    }
}
