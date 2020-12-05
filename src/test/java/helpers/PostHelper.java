package helpers;

import data.SystemPostData;
import managers.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PostHelper extends HelperBase {
    
    public PostHelper(ApplicationManager manager) {
        super(manager);
    }

    public SystemPostData getCreatedPostData() {
        String postText = manager.getDriver().findElementByName("id_text").getAttribute("value");
        String postTheme = manager.getDriver().findElementByName("id_theme").getAttribute("value");
        return new SystemPostData(postText, postTheme);
    }

    //public SystemPostData selectLastCreatedPostData() {
    //   return new SystemPostData();
    //}

    public void newSystemPost(SystemPostData systemPostData) {
        manager.getDriver().findElement(By.linkText("Игра")).click();
        manager.getDriver().findElement(By.linkText("Обсуждения")).click();
        manager.getDriver().findElement(By.linkText("FAQ")).click();
        manager.getDriver().findElement(By.cssSelector(".main-page-text > .btn")).click();
        manager.getDriver().findElement(By.id("id_text")).click();
        manager.getDriver().findElement(By.id("id_text")).sendKeys(systemPostData.text);
        manager.getDriver().findElement(By.id("id_theme")).click();
        {
            WebElement dropdown = manager.getDriver().findElement(By.id("id_theme"));
            dropdown.findElement(By.xpath("//option[. = '" + systemPostData.theme + "']")).click();
        }
        manager.getDriver().findElement(By.cssSelector("option:nth-child(3)")).click();
        manager.getDriver().findElement(By.cssSelector(".btn:nth-child(2)")).click();
    }
}
