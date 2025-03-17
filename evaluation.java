package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class evaluation {
    public static void main(String[] arg) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/");

        driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();
        driver.findElement(By.id("loginusername")).sendKeys("brajmohan1@gmail.com");
        driver.findElement(By.id("loginpassword")).sendKeys("brajmohan");
        driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();

        Thread.sleep(2000);

       WebElement product = driver.findElement(By.xpath("(//img[@class=\"card-img-top img-fluid\"])[1]"));
        product.click();

        driver.findElement(By.className("btn btn-success btn-lg")).click();

        driver.findElement(By.xpath("//a[text()=\"Cart\"]")).click();

        WebElement addtocart = driver.findElement(By.xpath("//td[text()=\"Samsung galaxy s6\"]"));

        if(addtocart.isDisplayed()){
            System.out.println("Add to cart item is dispaly");
        }
        else{
            System.out.println("Add to cart item is not display");
        }

        Thread.sleep(3000);

        driver.quit();
    }
}
