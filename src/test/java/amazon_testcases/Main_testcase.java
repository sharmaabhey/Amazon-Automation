package amazon_testcases;

import java.io.FileOutputStream;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.testng.annotations.Test;

import Datautils.Data_Supplier;
import amazon_pages.Amazon_Search_page;
import amazon_pages.Amazon_homepage;

public class Main_testcase extends Base_test {
    private static XSSFRow row = null;
    
    
    
    @Test(dataProvider="amzn", dataProviderClass= Data_Supplier.class)
    
    
    
    public void amazon_actions(Map obj) throws Exception  {
        Amazon_Search_page obji = new Amazon_Search_page(driver);
        obji.SetSubmitDetails("befjdb@gamil.com");
        Amazon_homepage objamazon = new Amazon_homepage(driver);
        objamazon.click_on_alltab();
        String oldwin = driver.getWindowHandle();
        for(String currwin :driver.getWindowHandles())
        {
            if(!oldwin.contentEquals(oldwin))
            {
                driver.switchTo().window(currwin);
                
            }
        }
        
        
        
//      String filename = "D:\\OneDrive - Coforge Limited\\Documents\\New folder\\data1.xls";
//      HSSFWorkbook  wb = new HSSFWorkbook ();
//      HSSFSheet sheet = wb.createSheet("Sheet1");
//      Row row = sheet.createRow(10);
//      row.createCell(0).setCellValue("abhay ");
//      row.createCell(1).setCellValue("Sharma ");
//      FileOutputStream fout = new FileOutputStream(filename);
//      wb.write(fout);  
//   
//      fout.close();
//      int r =0;
//      int c=3;
//        final String[][] csvMatrix = new String[10][10];
//          csvMatrix[r][c] = "Abhay";
////            csvMatrix[3][1] ="sharma";
////            csvMatrix[3][2] = "My";
////            csvMatrix[3][3] = "24353536";
////            csvMatrix[1][0] = "first1";
////            csvMatrix[1][1] = "second1";
////            csvMatrix[1][2] = "third1";
////            csvMatrix[2][0] = "first2";
////            csvMatrix[2][1] = "second2";
////            csvMatrix[2][2] = "third2";
//         CSVWriter csvWriter = null;
//          try {
//              csvWriter = new CSVWriter(new FileWriter("D:\\OneDrive - Coforge Limited\\Documents\\checktest1.csv",true));
//
//              for (int i = 0; i < csvMatrix.length; i++) {
//                   csvWriter.writeNext(csvMatrix[i]);
//            }
//
//          } catch (IOException e) {
//              e.printStackTrace(); // TODO handle exception properly
//          } finally {
//              try {
//                  csvWriter.close();
//              } catch (IOException e) {
//              }
//          }
        
        
//       try {
//              String filename = "D:\\OneDrive - Coforge Limited\\Documents\\New folder\\data.xls" ;
//              HSSFWorkbook workbook = new HSSFWorkbook();
//              HSSFSheet sheet = workbook.createSheet("FirstSheet");  
//
//              HSSFRow rowhead = sheet.createRow((short)0);
//              rowhead.createCell(0).setCellValue("No.");
//              rowhead.createCell(1).setCellValue("Name");
//              rowhead.createCell(2).setCellValue("Address");
//              rowhead.createCell(3).setCellValue("Email");
//
//              HSSFRow row = sheet.createRow((short)1);
//              row.createCell(0).setCellValue("1");
//              row.createCell(1).setCellValue("Sankumarsingh");
//              row.createCell(2).setCellValue("India");
//              row.createCell(3).setCellValue("sankumarsingh@gmail.com");
//
//              FileOutputStream fileOut = new FileOutputStream(filename);
//              workbook.write(fileOut);
//              fileOut.close();
//              workbook.close();
//              System.out.println("Your excel file has been generated!");
//
//          } catch ( Exception ex ) {
//              System.out.println(ex);
//          }
        
//        File file = new File("D:\\OneDrive - Coforge Limited\\Documents\\checktest1.csv");
//          Scanner sc = new Scanner(System.in);
//          try {
//              // create FileWriter object with file as parameter
//              FileWriter outputfile = new FileWriter(file);
//    
//              // create CSVWriter with ';' as separator
//              CSVWriter writer = new CSVWriter(outputfile, ';',
//                                               CSVWriter.NO_QUOTE_CHARACTER,
//                                               CSVWriter.DEFAULT_ESCAPE_CHARACTER,
//                                               CSVWriter.DEFAULT_LINE_END);
//    
//              // create a List which contains Data
//              List<String[]> data = new ArrayList<String[]>();
//            
//    
//              System.out.println("Enter no of rows");
//              int noOfRow = Integer.parseInt(sc.nextLine());
//              System.out.println("Enter Data");
//              for (int i = 0; i < noOfRow; i++) {
//                  String row = sc.nextLine();
//                  String[] rowdata = row.split(" ");
//                  data.add(rowdata);
//              }
////                data.add(new String[] { "Name", "Class", "Marks" });
////                data.add(new String[] { "Aman", "10", "620" });
////                data.add(new String[] { "Suraj", "10", "630" });
//    
//              writer.writeAll(data);
//    
//              // closing writer connection
//              writer.close();
//          }
//          catch (IOException e) {
//              // TODO Auto-generated catch block
//              e.printStackTrace();
//          }
        
    
          
          
//
//        // specified by filepath
//      File file = new File("D:\\OneDrive - Coforge Limited\\Documents\\checktest1.csv");
//      try {
//          // create FileWriter object with file as parameter
//          FileWriter outputfile = new FileWriter(file);
//    
//          // create CSVWriter object filewriter object as parameter
//          CSVWriter writer = new CSVWriter(outputfile);
//    
////            // adding header to csv
////            String[] header = { "Name", "Class", "Marks" };
////            writer.writeNext(header);
//    
//////           add data to csv
////            String[] data1 = { "Aman", "10", "620" };
////            writer.writeNext(data1);
//          String[] data2 = { "abhay", "10", "630" };
//          writer.writeNext(data2);
//    
//          // closing writer connection
//          writer.close();
//      }
//      catch (IOException e) {
//          // TODO Auto-generated catch block
//          e.printStackTrace();
//      }

        
        
    }
}
    
    

