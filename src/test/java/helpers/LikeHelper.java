package helpers;

import data.LikeData;
import managers.ApplicationManager;
import org.openqa.selenium.By;

public class LikeHelper extends HelperBase {

    public LikeHelper(ApplicationManager manager) {
        super(manager);
    }

    public void newLike(LikeData likeData) {
        manager.getDriver().findElement(By.linkText("Персонажи")).click();
        manager.getDriver().findElement(By.linkText("Игра")).click();
        manager.getDriver().findElement(By.linkText("Обсуждения")).click();
        manager.getDriver().findElement(By.linkText(likeData.getThemeName())).click();
        manager.getDriver().findElement(By.cssSelector("form:nth-child(4) > .btn")).click();
    }
}
