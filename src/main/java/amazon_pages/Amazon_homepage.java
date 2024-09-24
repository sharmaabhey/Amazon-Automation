package amazon_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_homepage {
    WebDriver driver;
    
    public Amazon_homepage(WebDriver driver) {
        this.driver=driver;
    }
    public void click_on_alltab() {
        driver.findElement(By.xpath("//button[text()='Click here to login via iEngage credentials']")).click();
        WebElement ele = driver.findElement(By.xpath("//input[@id='txtEmpCode']"));
        ele.sendKeys("104212");
        String value = ele.getAttribute("value");
        System.out.println("TExtBox value " +value);
        
        
    }
    
    
    public void taking_xshop_list(String opt) throws Exception {
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']//div")).click();
        
        driver.findElement(By.xpath("//a[@class='hmenu-item']//following::div[text()='"+opt+"']")).click();
        Thread.sleep(4000);
//      List<WebElement> xshop = driver.findElements(By.xpath("//div[@id='nav-xshop']//child::a"));
//      System.out.println(xshop);
//      for(WebElement ele : xshop) {
//          String str = ele.getText();
//          System.out.println(str);
//          if(str.equals(opt)) {
//              ele.click();
//              Thread.sleep(4000);
//          }
//      }
//      
//      
//  }
    }
}


