package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base {
    private Base base; // objeto local para comunicação com o objeto da classe extendida (selenium)

    // Construtor para a classe Base
    public Hooks(Base base){
        super(base.driver);
        this.base = base;
    }

    @Before
    public void setup(){
        // Informar onde está o driver
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/90/chromedriver.exe");
        // Instanciar o driver do Chrome
        base.driver = new ChromeDriver();

        //Maximizar a tela
        base.driver.manage().window().maximize();

        // Definir a espera implícita do Selenium WebDriver para 1 minuto
        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MICROSECONDS);

    }

    @After
    public void tearDown(){
        base.driver.quit(); // Destruir o objeto do Selenium
    }
}
