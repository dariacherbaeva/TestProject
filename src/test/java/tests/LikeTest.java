package tests;

import data.LikeData;
import data.UserData;
import generators.DataGenerator;

public class LikeTest extends TestBase {


    private UserData testUser;

    @Override
    public void testCase() {
        LikeData likeData = new LikeData("doesn\'t really feel like christmas");
        //UserData user = new UserData("admin", "admin");
        app.getNavigationHelper().openPage();
        app.getNavigationHelper().setWindowSize();
        app.getLogInHelper().logIn(testUser);
        app.getLikeHelper().newLike(likeData);
        app.getLogInHelper().logOut();
    }

    @Override
    public void additionalSetup() {
        testUser = DataGenerator.readUser("user.json");
    }
}
