import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
    private WebDriver driver;
    

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dives\\OneDrive\\Documents\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testLoginWithDifferentPasswords1() throws InterruptedException{
    	
    	String password = "1234567";
            driver.get("https://tieteats.netlify.app");
            WebElement usernameField = driver.findElement(By.id("login_email"));
            usernameField.sendKeys("chhabrakaran@gmail.com");

            WebElement passwordField = driver.findElement(By.id("login_password"));
            passwordField.sendKeys(password);

            WebElement submitButton = driver.findElement(By.id("login"));
            //submitButton.click();
            Thread.sleep(2000);
                  
            //validatePassword(password);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            if (password.length() < 8 || password.length() > 15) {
                System.out.println("Password must be between 8 and 15 characters long.");
                js.executeScript("alert('Password must be between 8 and 15 characters long.');");
                Thread.sleep(1500);
              // return;
            }
            driver.quit();
        }
    @Test(priority = 2)
    public void testLoginWithDifferentPasswords2() throws InterruptedException{
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dives\\OneDrive\\Documents\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
    	String password = "12345678";
            driver.get("https://tieteats.netlify.app");
            WebElement usernameField = driver.findElement(By.id("login_email"));
            usernameField.sendKeys("chhabrakaran@gmail.com");

            WebElement passwordField = driver.findElement(By.id("login_password"));
            passwordField.sendKeys(password);

            WebElement submitButton = driver.findElement(By.id("login"));
           // submitButton.click();
            Thread.sleep(2000);
                  
            //validatePassword(password);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            if (!password.matches(".*[A-Z].*")) {
    			System.out.println("Password must contain at least one uppercase alphabet.");
    			js.executeScript("alert('Password must contain at least one uppercase alphabet.');");
    			Thread.sleep(1500);
    			//return;
    		}
            driver.quit();
        }

    @Test(priority = 3)
    public void testLoginWithDifferentPasswords3() throws InterruptedException{
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dives\\OneDrive\\Documents\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
       
    	String password = "12345678A";
            driver.get("https://tieteats.netlify.app");
            WebElement usernameField = driver.findElement(By.id("login_email"));
            usernameField.sendKeys("chhabrakaran@gmail.com");

            WebElement passwordField = driver.findElement(By.id("login_password"));
            passwordField.sendKeys(password);

            WebElement submitButton = driver.findElement(By.id("login"));
            Thread.sleep(2000);
                  
            //validatePassword(password);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            if (!password.matches(".*[a-z].*")) {
                System.out.println("Password must contain at least one lowercase alphabet.");
                js.executeScript("alert('Password must contain at least one lowercase alphabet.');");
                Thread.sleep(1500);
                //return;
            }
            driver.quit();
        }
    @Test(priority = 4)
    public void testLoginWithDifferentPasswords4() throws InterruptedException{
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dives\\OneDrive\\Documents\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
    	String password = "12345678Aa";
            driver.get("https://tieteats.netlify.app");
            WebElement usernameField = driver.findElement(By.id("login_email"));
            usernameField.sendKeys("chhabrakaran@gmail.com");

            WebElement passwordField = driver.findElement(By.id("login_password"));
            passwordField.sendKeys(password);

            WebElement submitButton = driver.findElement(By.id("login"));
           // submitButton.click();
            Thread.sleep(2000);
                  
            //validatePassword(password);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            if (!password.matches(".*[!@#\\$%\\^&\\*\\(\\)\\-_\\+=].*")) {
                System.out.println("Password must contain at least one special character.");
                js.executeScript("alert('Password must contain at least one special character.');");
                Thread.sleep(1500);
                //return;
            }
            driver.quit();
        }
    @Test(priority = 5)
    public void testLoginWithDifferentPasswords5() throws InterruptedException{
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dives\\OneDrive\\Documents\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
    	String password = "12345678Aa$";
            driver.get("https://tieteats.netlify.app");
            WebElement usernameField = driver.findElement(By.id("login_email"));
            usernameField.sendKeys("chhabrakaran@gmail.com");

            WebElement passwordField = driver.findElement(By.id("login_password"));
            passwordField.sendKeys(password);

            WebElement submitButton = driver.findElement(By.id("login"));
            //submitButton.click();
            Thread.sleep(2000);
                  
            //validatePassword(password);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            if (password.contains("12345678Aa$")) {
            System.out.println("Password is invalid");
            js.executeScript("alert('Password is invalid.');");
            Thread.sleep(1500);
         //   return;
            }
            driver.quit();
        }
    @Test(priority = 6)
    public void testLoginWithDifferentPasswords6() throws InterruptedException{
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dives\\OneDrive\\Documents\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
    	String password = "12345678Aa$ ";
            driver.get("https://tieteats.netlify.app");
            WebElement usernameField = driver.findElement(By.id("login_email"));
            usernameField.sendKeys("chhabrakaran@gmail.com");

            WebElement passwordField = driver.findElement(By.id("login_password"));
            passwordField.sendKeys(password);

            WebElement submitButton = driver.findElement(By.id("login"));
            //submitButton.click();
            Thread.sleep(2000);
                  
            //validatePassword(password);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            if (password.contains(" ")) {
                System.out.println("Password cannot contain whitespace.");
                js.executeScript("alert('Password cannot contain whitespace.');");
                Thread.sleep(1500);
               // return;
            }
            driver.quit();
        }
    

    @Test(priority = 7)
    public void testLoginWithValidCredentials()throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dives\\OneDrive\\Documents\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.get("https://tieteats.netlify.app");
        WebElement usernameField = driver.findElement(By.id("login_email"));
        usernameField.sendKeys("divesh12@gmail.com");

        WebElement passwordField = driver.findElement(By.id("login_password"));
        passwordField.sendKeys("Divesh27@");

        WebElement submitButton = driver.findElement(By.id("login"));
        submitButton.click();
        Thread.sleep(2000);
        driver.quit();
    }

    
    @Test(priority=8)
    public void navigateToRestaurantPage() {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dives\\OneDrive\\Documents\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.get("https://tieteats.netlify.app/home");
        driver.findElement(By.xpath("//*[@id=\"Restaurants\"]/a[1]/div/div[1]/img")).click();
    }
    @Test(dependsOnMethods = "navigateToRestaurantPage")
    public void selectFoodCategory() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"categorySection\"]/div/div[1]/div[2]/div/div[1]/img")).click();
    }

    @Test(dependsOnMethods = "selectFoodCategory")
    public void filterFoodItems() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"chinese\"]/div[2]/div[2]/div/div/div[2]/div[2]/span[3]/i")).click();
    }

    @Test(dependsOnMethods = "filterFoodItems")
    public void addToCart() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"chinese\"]/div[3]/button")).click();
    }

    @Test(dependsOnMethods = "addToCart")
    public void enterDeliveryAddress() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Hostel-O");
    }

    @Test(dependsOnMethods = "enterDeliveryAddress")
    public void confirmOrder() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/a")).click();
        Thread.sleep(3000);
        driver.quit();
    }
    
    @Test(priority=9)
    public void navigateToGetMealPage() {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dives\\OneDrive\\Documents\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.get("https://tieteats.netlify.app/home");
        driver.findElement(By.xpath("/html/body/header/nav/ul/li[3]/a")).click();
    }
    @Test(dependsOnMethods = "navigateToGetMealPage")
    public void selectoption() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"get_meal\"]")).click();
    }
    @Test(dependsOnMethods = "selectoption")
    public void selectdifferentmeal() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"get_meal\"]")).click();
    }
    @Test(dependsOnMethods = "selectdifferentmeal")
    public void selectdifferentmeal2() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"get_meal\"]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
    }


    