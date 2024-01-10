package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.emag.ro");
        WebElement input = driver.findElement(By.xpath("//input[@id='searchboxTrigger']"));
        WebElement searchButton = driver.findElement(By.xpath("//input[@type='search']"));
        input.clear();
        input.sendKeys("phone");
        searchButton.click();
        driver.quit();
    }
}
