package tests;

import data.UserData;

public class LogInTest extends TestBase {
    @Override
    public void testCase() {
        UserData user = new UserData("admin", "admin");
        app.getNavigationHelper().openPage();
        app.getNavigationHelper().setWindowSize();
        app.getLogInHelper().logIn(user);
        app.getLogInHelper().logOut();
        app.terminate();
    }
}