package pages;

import general.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product extends Base {

    // Mapeamentos
    @FindBy(xpath = "div.site-wrap:nth-child(37) main.container-produto:nth-child(5) div.container.interna div.row:nth-child(8) div.col-md-9 div.col-md-7.prod-info:nth-child(6) > h1:nth-child(1)")
    private WebElement productTitle;

    @FindBy(css = "div.price-current")
    private WebElement priceCurrent;

    public Product(WebDriver driver) {
        super(driver);
    }

    // Ler o título da guia
    public String readTitleTab(){
        return driver.getTitle();
    }
    // Ler o nome do produto
    public String readProductTitle(){
        return productTitle.getText();
    }

    // Ler o preço atual
    public String readPriceCurrent(){
        return priceCurrent.getText();
    }

}

