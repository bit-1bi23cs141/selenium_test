package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://bitwebserver.bittechlearn.online:8084/Students/StudentLogin.aspx");

        System.out.println("Title: " + driver.getTitle());

        driver.quit();
        System.exit(0);
    }
}

