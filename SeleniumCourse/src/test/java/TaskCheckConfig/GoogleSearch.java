package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver"); // Chrome - ustawienie property systemowego

        WebDriver driver = new ChromeDriver(); // Chrome - wybranie drivera

//        System.setProperty("webdriver.gecko.driver",
//                "src/main/resources/drivers/geckodriver"); // Firefox - ustawienie property systemowego
//
//        WebDriver driver = new FirefoxDriver(); // Firefox - wybranie drivera
        driver.manage().window().maximize(); // maksymalizujemy okno
        driver.get("http://www.google.com"); // nawigujemy do strony Google
        WebElement acceptCookiesButton = driver.findElement(By.id("L2AGLb")); // lokalizujemy element 'Zaakceptuj wszystko'
        acceptCookiesButton.click(); // klikamy w element
        WebElement element = driver.findElement(By.name("q")); // lokalizujemy element search bar
        element.clear(); // usuwamy tekst z search bar'a
        element.sendKeys("Coderslab"); // przesyłamy tekst do search bar'a
        element.submit(); // zatwierdzamy formularz
        driver.quit(); // zamykamy przeglądarkę
    }
}