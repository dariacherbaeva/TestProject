package tests;

import data.UserData;
import generators.DataGenerator;

public class LogInTest extends TestBase {

    private UserData testUser;

    @Override
    public void testCase() {
        //UserData user = new UserData("admin", "admin");
        app.getNavigationHelper().openPage();
        app.getNavigationHelper().setWindowSize();
        app.getLogInHelper().logIn(testUser);
        app.getLogInHelper().logOut();
        //app.terminate();
    }

    @Override
    public void additionalSetup() {
        testUser = DataGenerator.readUser("user.json");
    }
}