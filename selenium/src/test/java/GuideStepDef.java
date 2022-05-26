import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pe.edu.upc.selenium.GenericWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GuideStepDef {
    public static WebDriver webDriver;

    public GuideStepDef() {
        webDriver = GenericWebDriver.getWebDriver();
    }




    @When("Hace click en el icono del juego")
    public void leHaceClickEnJuego() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);



       List<WebElement> icons = webDriver.findElements(By.className("home-img"));
       for (WebElement element: icons){
           element.click();
           break;
       }
    }


    @Then("se le muestra las guias disponibles")
    public void SeMuestraFormularioLogin() {


    }


    @Given("El usuario se encuentra en la pantalla de guias")
    public void elUsuarioSeEncuentraEnLaPantallaDeGuias() throws InterruptedException {

        // Carga la pagina
        webDriver.get("https://helpi-app.netlify.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();

        TimeUnit.SECONDS.sleep(2);

        List<WebElement> icons = webDriver.findElements(By.className("home-img"));
        for (WebElement element: icons){
            element.click();
            break;
        }


    }

    @When("Hace click en algun juego")
    public void haceClickEnAlgunJuego() throws InterruptedException {

        TimeUnit.SECONDS.sleep(2);

        List<WebElement> games = webDriver.findElements(By.className("gamemenu-content-training-cards"));
        for (WebElement element: games){
            element.click();
            break;
        }



    }

    @Then("se le muestra a detalle el juego")
    public void seLeMuestraADetalleElJuego() {
    }
}
