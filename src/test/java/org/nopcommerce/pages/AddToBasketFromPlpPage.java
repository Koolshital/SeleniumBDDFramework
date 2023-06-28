package org.nopcommerce.pages;

import org.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToBasketFromPlpPage extends DriverManager {

  @FindBy(linkText = "Books")
  WebElement booksElement;
  @FindBy(linkText = "Apparel")
  WebElement apparelElement;
  @FindBy(xpath = "//div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")
  WebElement firstBookSelect;
  @FindBy(xpath = "//div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")
  WebElement secondBookSelect;
  @FindBy(xpath = "//div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")
  WebElement thirdBookSelect;
  @FindBy(xpath = "//p[@class=\"content\"]")
  WebElement notifyAdded;

  @FindBy(xpath = "//span[@class=\"cart-qty\"]")
  WebElement cartQuantity;

  public void openAnyCategory(String category) {
    switch (category){
      case "Books": booksElement.click();
      break;
      case "Apparel":apparelElement.click();
      break;
      default:booksElement.click();

  }}
  public String readCartItemQuantity() {
    return cartQuantity.getText();
  }
  public void addSelectedItem(int itemNumber){
    switch (itemNumber){
      case 1:firstBookSelect.click();
      break;
      case 2:secondBookSelect.click();
      break;
      case 3:thirdBookSelect.click();
      default:firstBookSelect.click();
    }

  }


//  public boolean notifyQuantityAdded() {
//    return notifyAdded.isDisplayed();
//
//  }


}
