package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {

    // 1. Mapeamento de Elementos
    @FindBy(id = "search")
    private WebElement txtInputSearch;

    @FindBy(css = "button.button-search")
    private WebElement btnSearch;

    // 2. Construtor

    public Home(WebDriver driver) {
        super(driver);
    }


    // 3. Ações dos Elementos

    public  void serch(String product){
        txtInputSearch.click(); //clicar na caixa de pesquisa
        txtInputSearch.clear(); //Limpar conteúdo da caixa de texto
        txtInputSearch.sendKeys(product); // Escrever na caixa de texto
    }

    public void searchWithMagnifierButton (String product) { //pesquisarComBotaoDaLupa
        serch(product);
        btnSearch.click(); // Clicar no botão da lupa
    }

    public void searchWithEnter(String product) {
        serch(product);
        txtInputSearch.sendKeys(Keys.ENTER);
    }
}
