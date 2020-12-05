package tests;

import data.MessageData;
import data.UserData;

public class MessageTest extends TestBase {


    @Override
    public void testCase() {
        UserData user = new UserData("admin", "admin");
        MessageData message = new MessageData("some text", "daria");
        app.getNavigationHelper().openPage();
        app.getNavigationHelper().setWindowSize();
        app.getLogInHelper().logIn(user);
        app.getMessageHelper().sendMessage(message);
        app.getLogInHelper().logOut();
        //app.terminate();
    }
}
