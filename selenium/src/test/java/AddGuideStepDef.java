import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pe.edu.upc.selenium.GenericWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddGuideStepDef {
    public static WebDriver webDriver;

    public AddGuideStepDef() {
        webDriver = GenericWebDriver.getWebDriver();
    }



    @Given("El usuario se encuentra logeado")
    public void elUsuarioSeEncuentraLogeado() {

        // Carga la pagina
        webDriver.get("https://helpi-app.netlify.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();
        webDriver.findElement(By.linkText("Login")).click();
        webDriver.findElement(By.id("user")).sendKeys("test@gmail.com");
        webDriver.findElement(By.id("password")).sendKeys("test");

        webDriver.findElement(By.className("login-form-submit")).click();

    }

    @When("Ingresa a un juego y presiona el boton de agregar")
    public void ingresaAUnJuego() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);

        List<WebElement> games = webDriver.findElements(By.className("home-img"));
        for (WebElement element: games){
            element.click();
            break;
        }
    }



    @Then("se le agrega el juego a su libreria")
    public void seLeAgregaElJuegoASuLibreria() {

    }

    @When("Hace click en profile")
    public void haceClickEnProfile() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);

        webDriver.findElement(By.linkText("Profile")).click();
    }

    @Then("se le muestra las guias que posee")
    public void seLeMuestraLasGuiasQuePosee() {
    }

    @And("selecciona su guia")
    public void seleccionaSuGuia() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);

        List<WebElement> games = webDriver.findElements(By.className("gamemenu-content-training-cards"));
        for (WebElement element: games){
            element.click();
            break;
        }

        webDriver.findElement(By.className("gamemenu-info-btn")).click();

    }
}
