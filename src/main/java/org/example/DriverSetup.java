package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSetup {
    public static WebDriver getDriver() {
        // Đặt đường dẫn đến chromedriver
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver-win32\\chromedriver.exe");

        // Khởi tạo trình duyệt Chrome
        WebDriver driver = new ChromeDriver();

        // Cấu hình ChromeOptions để xử lý vấn đề tương thích
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // Thiết lập kích thước cửa sổ trình duyệt
        driver.manage().window().maximize();
        return driver;
    }
}
