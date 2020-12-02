package tests;

import data.SystemPostData;
import data.UserData;

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
    }
}
