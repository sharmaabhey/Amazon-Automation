package amazon_pages2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazon_home {
    WebDriver driver;

    public amazon_home(WebDriver driver) {

        this.driver = driver;

    }

    public void click_onsearchbar(String product_name) {

        WebElement prod_name = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        prod_name.click();
        prod_name.sendKeys(product_name);
        prod_name.sendKeys(Keys.ENTER);
        
    }

//  public void selecting_filter(String Filter) throws InterruptedException {
//
//      String str = Filter;
//      String[] splitter = str.split(",");
//      System.out.println(splitter.length);
//      for (int i = 0; i < splitter.length; i++) {
//          String fil = splitter[i];
//          System.out.println(fil);
//          try {
//              WebElement filter = driver.findElement(By.xpath("//span[text()='" + fil + "']"));
//              if (filter.isDisplayed()) {
//                  filter.click();
//              }
//
//          } catch (NoSuchElementException ne) {
//              System.out.println("No filter");
//          }
//
//
//          
//      }
//  }
    
    
    public void taking_list_of_filters() {
        List<WebElement> li = driver.findElements(By.xpath("//li[contains(@class,'a-spacing-micro')]//a/span"));
        System.out.println(li.size());
//      String[] sort_alpha = new String[li.size()];
        for(int i = 0; i<li.size();i++) {
            String str = li.get(i).getText();
            System.out.println(str);
//          sort_alpha[i] = li.get(i).getText();
//          System.out.println(sort_alpha);
            
            
            
        }
        
    }
}

//====================================================================================================================================
//      List<WebElement> filters = driver.findElements(By.xpath("//li[contains(@class,'a-spacing-micro')]//a/span"));
//      for (WebElement ele : filters) {
//          
//          
//          try {
//              String str = ele.getText();
//              System.out.println(str);
//              String fil = Filter;
//              String[] splitter = fil.split(",");
//              System.out.println(splitter.length);
//              for (int i = 0; i < splitter.length; i++) {
//                  String splitted = splitter[i];
//                  System.out.println(splitted);
//                  if (splitted.equals(str)) {
//                      ele.click();
//                  }
//              }
//          } catch (StaleElementReferenceException e) {
//              List<WebElement> filter = driver.findElements(By.xpath("//li[contains(@class,'a-spacing-micro')]//a/span"));
//
//              for (WebElement el : filter) {
//              String str = el.getText();
//              System.out.println(str);
//              String fil = Filter;
//              String[] splitter = fil.split(",");
//              System.out.println(splitter.length);
//              for (int i = 0; i < splitter.length; i++) {
//                  String splitted = splitter[i];
//                  System.out.println(splitted);
//                  if (splitted.equals(str)) {
//                      ele.click();
//                  }
//              }
//              }
//              
//          }
////            String str = ele.getText();
////            System.out.println(str);
////            String fil = Filter;
////            String[] splitter = fil.split(",");
////            System.out.println(splitter.length);
////            for (int i = 0; i < splitter.length; i++) {
////                String splitted = splitter[i];
////                System.out.println(splitted);
////                if (splitted.equals(str)) {
////                    ele.click();
////                }
////            }
//
//      }
//
//  }
//}