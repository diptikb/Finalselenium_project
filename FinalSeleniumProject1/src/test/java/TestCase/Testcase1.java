package TestCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.SalePage;
import Pages.ShopPage;
import TestBase.WebTestBase;

public class Testcase1 extends WebTestBase{

	 SalePage salePage;
     ShopPage shopPage;
    
public  Testcase1()
{
	 super();
}
@BeforeTest
public void BeforeMethod()
{    
	 initialization();
	 salePage =new SalePage(driver);
	 shopPage=new ShopPage(driver);
	 
}
@Test(priority = 0, groups = "Search", description = "Filter products by a range of prices")
public void filterByPrice(){
 shopPage.filterByPrice();
}
@Test(priority = 1, groups = "Search", description = "Filter products by Color")
public void filterByColor() {
	SoftAssert softAssert=new SoftAssert(); 
     shopPage.filterByColor();
      softAssert.assertAll();
}
@Test(priority = 2, groups = "Search", description = "Sorting products by price: low to high")
public void sortByPrice(){
 
SoftAssert softAssert=new SoftAssert(); 
 shopPage.sortByPrice();
 softAssert.assertAll();
}
@Test(priority = 3, groups = "Search", description = "Search by drop-down")
public void searchByDropdown() throws InterruptedException {

SoftAssert softAssert=new SoftAssert(); 
 shopPage.searchByDropdown();
 softAssert.assertAll();
 
}
@Test(priority = 4, groups = "Search", description = "Search by product name")
public void searchByName() {

SoftAssert softAssert=new SoftAssert(); 
 shopPage.searchByName();
softAssert.assertAll();
}
@Test(priority = 5, groups = "Search", description = "Blank search")
public void blankSearchBox() {;

SoftAssert softAssert=new SoftAssert(); 
 shopPage.blankSearch();
  softAssert.assertAll();
}

 @Test(priority = 6, groups = "Purchase", description = "Try adding product without choosing color")
    public void noColorSelection() throws InterruptedException {
       SoftAssert softAssert=new SoftAssert(); 
       salePage.noColorSelection();
        softAssert.assertAll();
    }
 @Test(priority = 7, groups = "Purchase", description = "Add color from the drop-down")  
    public void addMultipleColor() throws InterruptedException {
      SoftAssert softAssert=new SoftAssert(); 
      salePage.addMultipleColor();
      softAssert.assertAll();
    }
 @Test(priority = 8, groups = "Purchase", description = "Add multiple product to card")
    public void addMultipleProduct() {
       SoftAssert softAssert=new SoftAssert(); 
       salePage.addMultipleProduct();
       softAssert.assertAll();
    }
 @Test(priority = 9, groups = "Purchase", description = "Try adding less than one product")
    public void productQuantity() {
        SoftAssert softAssert=new SoftAssert(); 
        salePage.productQuantity();
        softAssert.assertAll();
    }
 @Test(priority = 10, groups = "Purchase", description = "The process of placing orders")
    public void checkout() throws InterruptedException{
      SoftAssert softAssert=new SoftAssert();
      salePage.checkout();
      softAssert.assertAll();
    }
}
