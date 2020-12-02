package helpers;

import data.UserData;
import managers.ApplicationManager;
import org.openqa.selenium.By;

public class LogInHelper extends HelperBase {

    public LogInHelper(ApplicationManager manager) {
        super(manager);
    }

    public void logIn(UserData userData) {
        manager.getDriver().findElement(By.linkText("Вход")).click();
        manager.getDriver().findElement(By.linkText("Войти")).click();
        manager.getDriver().findElement(By.id("id_username")).click();
        manager.getDriver().findElement(By.id("id_username")).sendKeys(userData.username);
        manager.getDriver().findElement(By.id("id_password")).click();
        manager.getDriver().findElement(By.id("id_password")).sendKeys(userData.password);
        manager.getDriver().findElement(By.cssSelector(".btn:nth-child(1)")).click();
    }

    public void logOut() {
        manager.getDriver().findElement(By.linkText("Профиль")).click();
        manager.getDriver().findElement(By.linkText("Выйти")).click();
        manager.getDriver().findElement(By.linkText("Нажмите сюда, чтобы снова войти.")).click();
    }
}
