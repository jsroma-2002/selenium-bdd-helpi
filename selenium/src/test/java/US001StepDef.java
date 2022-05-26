import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pe.edu.upc.selenium.GenericWebDriver;

public class US001StepDef {
    public static WebDriver webDriver;

    public US001StepDef() {
        webDriver = GenericWebDriver.getWebDriver();
    }
    @Given("El usuario se encuentra en la pantalla de búsqueda")
    public void elUsuarioIngresaALaWeb() {
        // Carga la pagina
        webDriver.get("https://helpi-app.netlify.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();
    }


    @When("Ingresa a la barra de búsqueda e ingresa el nombre del coach")
    public void leHaceClick() {

        webDriver.findElement(By.linkText("About")).click();

    }

    @Then("se muestra la lista de perfiles que coincidan con el nombre ingresado")
    public void Selemuestra() {
    }
}
