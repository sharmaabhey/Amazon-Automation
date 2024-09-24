package amazon_pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class config_reader {
    
    public static Properties get_funcn() throws IOException {
        FileInputStream fs = new FileInputStream("C:\\Users\\Abhay.4.Sharma\\eclipse-workspace\\amazon\\configuration\\config.properties");
        Properties prop = new Properties();
        prop.load(fs);
        return prop;
    }
    
    
    public static String get_url() throws IOException {
        String str = get_funcn().getProperty("url");
        return str;
    }
    
    public static String get_prod_name() throws IOException {
        String str = get_funcn().getProperty("product");
        return str;
    }

}