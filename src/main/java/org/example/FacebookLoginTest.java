package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FacebookLoginTest {
    public static void main(String[] args) {
        // Khởi tạo WebDriver
        WebDriver driver = DriverSetup.getDriver();

        try {
            // Mở trang Facebook
            driver.get("https://www.facebook.com");
            System.out.println("Mở trang Facebook thành công.");

            // Test Case 2: Tài khoản không tồn tại
            loginTest(driver, "nonexistent_email@gmail.com", "any_password");

            // Test Case 3: Sai mật khẩu
            loginTest(driver, "example@gmail.com", "wrong_password");

            // Test Case 4: Bỏ trống các trường
            loginTest(driver, "", "");

            // Test Case 5: Email không hợp lệ
            loginTest(driver, "invalidemail", "password123");

            // Test Case 1: Đăng nhập thành công
            loginTest(driver, "nguyenlongdang76@gmail.com", "nguyenlong");

        } finally {
            // Đóng trình duyệt
            //driver.quit();
        }
    }

    // Hàm kiểm thử đăng nhập
    public static void loginTest(WebDriver driver, String email, String password) {
        try {
            // Tìm các trường nhập liệu
            WebElement emailField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("pass"));
            WebElement loginButton = driver.findElement(By.name("login"));

            // Nhập thông tin
            emailField.clear();
            emailField.sendKeys(email);
            passwordField.clear();
            passwordField.sendKeys(password);

            // Nhấn nút đăng nhập
            loginButton.click();

            // Sử dụng WebDriverWait để kiểm tra URL
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.urlContains("facebook.com"));

            // Kiểm tra URL sau khi đăng nhập
            String currentUrl = driver.getCurrentUrl();

            if (currentUrl.contains("facebook.com/two_step_verification")) {
                System.out.println("Đăng nhập thành công nhưng cần xác minh hai bước với email: " + email);
            } else if (currentUrl.equals("https://www.facebook.com/")) {
                System.out.println("Đăng nhập thành công và chuyển đến trang chủ với email: " + email);
            } else {
                // Kiểm tra sự tồn tại của thông báo lỗi
                List<WebElement> errorMessages = driver.findElements(By.xpath("//div[contains(@class, '_9ay7')]"));
                if (!errorMessages.isEmpty()) {
                    System.out.println("Đăng nhập thất bại với email: " + email);
                    System.out.println("Thông báo lỗi: " + errorMessages.get(0).getText());
                } else {
                    System.out.println("Đăng nhập thất bại với email: " + email + " nhưng không tìm thấy thông báo lỗi.");
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi trong quá trình kiểm thử: " + e.getMessage());
        }
    }
}