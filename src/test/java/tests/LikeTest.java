package tests;

import data.LikeData;
import data.UserData;

public class LikeTest extends TestBase {


    @Override
    public void testCase() {
        LikeData likeData = new LikeData("doesn\'t really feel like christmas");
        UserData user = new UserData("admin", "admin");
        app.getNavigationHelper().openPage();
        app.getNavigationHelper().setWindowSize();
        app.getLogInHelper().logIn(user);
        app.getLikeHelper().newLike(likeData);
        app.getLogInHelper().logOut();
    }
}
