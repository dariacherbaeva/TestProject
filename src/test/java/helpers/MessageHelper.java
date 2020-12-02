package helpers;

import data.MessageData;
import helpers.HelperBase;
import managers.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MessageHelper extends HelperBase {

    public MessageHelper(ApplicationManager manager) {
        super(manager);
    }

    public void sendMessage(MessageData messageData) {
        manager.getDriver().findElement(By.linkText("Профиль")).click();
        manager.getDriver().findElement(By.linkText("Мои сообщения")).click();
        manager.getDriver().findElement(By.linkText("Новое сообщение")).click();
        manager.getDriver().findElement(By.id("id_text")).click();
        manager.getDriver().findElement(By.id("id_text")).sendKeys(messageData.messageText);
        manager.getDriver().findElement(By.id("id_to_who")).click();
        {
            WebElement dropdown = manager.getDriver().findElement(By.id("id_to_who"));
            dropdown.findElement(By.xpath("//option[. = '" + messageData.username + "']")).click();
        }
        manager.getDriver().findElement(By.cssSelector("option:nth-child(7)")).click();
        manager.getDriver().findElement(By.cssSelector(".btn:nth-child(1)")).click();
    }

}
