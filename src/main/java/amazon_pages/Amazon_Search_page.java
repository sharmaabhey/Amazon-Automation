package amazon_pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Datautils.ExcelReader;

public class Amazon_Search_page {
    WebDriver driver;
    @FindBy(id = "nav-search-submit-button")
    WebElement Searchbtn;
    @FindBy(id = "featurebullets_feature_div")
    WebElement aboutItem;
    @FindBy(id = "buy-now-button")
    WebElement Buybtn;
    @FindBy(id = "ap_email")
    WebElement emailBox;
    @FindBy(id = "continue")

    WebElement Continuebtn;
    @FindBy(xpath = "//h4[text()='There was a problem']")
    WebElement alertMsg;
    
//    @FindBy(xpath = "//div[contains(@class,'sg-col sg')]//h2/a/span")
//    List<WebElement> productlst;
//  
    
    public Amazon_Search_page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
        
        
    }
    public void searching_product(String prod) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    js.executeScript("arguments[0].click", ele);
        Thread.sleep(2000);
        
        js.executeScript("arguments[0].value='"+prod+"'", ele);
//      ele.sendKeys(prod);
        ele.sendKeys(Keys.ENTER);
        
    
        Thread.sleep(4000);
    }
    
    
//  public void taking_list_of_results() {
//      List<WebElement> ele = driver.findElements(By.xpath("//span[text()='RESULTS']//following::div[@class='s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 AdHolder sg-col s-widget-spacing-small sg-col-12-of-16']//div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 s-list-col-right']//h2/a/span"));
//      for(WebElement web:ele) {
//          String str = web.getText();
//          System.out.println(str);
//          
//          
//      }
//  }
    
     public void SetProductToBuy(String buy) {
         
         List<WebElement> productlst = driver.findElements(By.xpath("//div[contains(@class,'sg-col sg')]//h2/a/span"));
         for (WebElement ele : productlst) {
             String str = ele.getText();
             System.out.println(str);
             if(str.equals(buy)) {
                 ele.click();
                 String oldwin = driver.getWindowHandle();
                    for(String currwin: driver.getWindowHandles()) {
                        if(oldwin != currwin) {
                            driver.switchTo().window(currwin);
             }
         }
             }
         }

            
//          for (WebElement Allprod : productlst) {
//              String AttprodText = Allprod.getText();
//              System.out.println(AttprodText);
//              //reporter.pass("the whole product list =" + AttprodText);
//              if (AttprodText.equals(buy)) {
////                    String currxpath = "(//div[contains(@class,'sg-col sg')]//h2/a/span[contains(text(),'" + buy
////                            + "')])[1]";
////                    WebElement CurrEle = driver.findElement(By.xpath(currxpath));
//                  Allprod.click();
//                  System.out.println(buy);
//                 // reporter.pass("buying product as=" + Buy);
//              }
//          }
        }

        public void GetTableValues() {

            String TableText = driver.findElement(By.xpath("//table[@class='a-normal a-spacing-micro']")).getText();
            System.out.println(TableText);
            ExcelReader.setCellData("Sheet1", "ProductInfo", 2, TableText);

        }

        public void getaboutItemDetails() {
            String AboutItemText = aboutItem.getText();
            ExcelReader.setCellData("Sheet1", "AboutItem", 2, AboutItemText);

        }

        public void SetSubmitDetails(String email) {
            Buybtn.click();
            emailBox.click();
            emailBox.sendKeys(email);
            Continuebtn.click();
            String text = alertMsg.getText();
            System.out.println(text);

        }

}