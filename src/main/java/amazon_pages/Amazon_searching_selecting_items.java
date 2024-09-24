package amazon_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_searching_selecting_items {
    WebDriver driver;
    
    
    
    public Amazon_searching_selecting_items(WebDriver driver) {
        this.driver=driver;
    }
    
    public void click_on_searchbar_and_sendingkeys(String key) throws InterruptedException {
        WebElement ele =driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        ele.click();
        ele.sendKeys(key);
        Thread.sleep(2000);
        ele.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//span[text()='See more']"));
//      WebDriverWait wait = new WebDriverWait(driver,30);
//      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Delivery Day']")));
        
    }
     public void selcting_filters(String head , String filter) throws InterruptedException {
         
         String heading = filter;
         String[] Splitter = heading.split(",");
//       for(int s =0 ; s<Splitter.length;s++) {
//           String splitted_element = Splitter[s];
//           System.out.println(splitted_element);
         
         
         List<WebElement> filter_head = driver.findElements(By.xpath("//div[@class='a-section a-spacing-double-large']//child::div[@class='a-section a-spacing-none']//child::div[@class='a-section a-spacing-small']"));
         System.out.println(filter_head.size());
         for(int i =1 ; i<filter_head.size();i++) {
             String stri = filter_head.get(i).getText();
             System.out.println("heading:"+stri );
             if(stri.equals(head)) {
             List<WebElement> filters = driver.findElements(By.xpath("(//div[@class='a-section a-spacing-double-large']//child::div[@class='a-section a-spacing-none']//child::div[@class='a-section a-spacing-small'])["+(i+1)+"]//following-sibling::ul/li"));
             System.out.println(filters.size());
             for (int j=0;j<filters.size()+1;j++) {
                 WebElement web = driver.findElement(By.xpath("((//div[@class='a-section a-spacing-double-large']//child::div[@class='a-section a-spacing-none']//child::div[@class='a-section a-spacing-small'])["+(i+1)+"]//following-sibling::ul/li)["+(j+1)+"]//span[@class='a-list-item']"));
                 
                 String str = filters.get(j).getText();
                 System.out.println(str);
//               String heading = filter;
//               String[] Splitter = heading.split(",");
                 for(int s =0 ; s<Splitter.length;s++) {
                     String splitted_element = Splitter[s];
                     System.out.println(splitted_element);
                     if(str.equals(splitted_element)) {
                         web.click();
//                       try {
//                           web.click();
//                           
//                       }catch(StaleElementReferenceException e) {
//                           WebElement webele = driver.findElement(By.xpath("((//div[@class='a-section a-spacing-double-large']//child::div[@class='a-section a-spacing-none']//child::div[@class='a-section a-spacing-small'])["+(i+1)+"]//following-sibling::ul/li)["+(j+1)+"]//span[@class='a-list-item']"));
//                           
//                           webele.click();
//                           
//                       }
                         
                         
                         
                     }
                     
                 }
                 
                 
//               if(str.equals(filter)) {
//                   System.out.println("it is working");
//                   break;
//                   
//                   
//                   
//               }
//               
                 
                
                 
                 
             }
        
             
             
             
             }
//           for(WebElement ele: filters) {
//              
//               
//               String str = ele.getText();
//               System.out.println(str);
//               System.out.println("==================");
//           }
         }
        
         
     }
    
    
    
    

}