import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pe.edu.upc.selenium.GenericWebDriver;

public class RegisterStepDef {
    public static WebDriver webDriver;

    public RegisterStepDef() {
        webDriver = GenericWebDriver.getWebDriver();
    }


    @Given("El usuario ingresa a la web")
    public void elUsuarioIngresaALaWeb() {
        // Carga la pagina
        webDriver.get("https://helpi-app.netlify.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();
    }

    @Given("El usuario se encuentra en la pantalla de registro")
    public void elUsuarioIngresaAlRegistro() {

        // Carga la pagina
        webDriver.get("https://helpi-app.netlify.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();
        webDriver.findElement(By.linkText("Register")).click();
    }

    @When("Hace click en el boton register now")
    public void leHaceClick() {

        webDriver.findElement(By.linkText("Register")).click();

    }

    @When("Completa sus datos")
    public void completarDatos() {
        webDriver.findElement(By.id("user")).sendKeys("Test");
        webDriver.findElement(By.id("email")).sendKeys("test@gmail.com");
        webDriver.findElement(By.id("password")).sendKeys("test");
        webDriver.findElement(By.id("birthdate")).sendKeys("22032001");

    }
    @And("presiona el boton de enviar")
    public void presionaEnviar() {

        webDriver.findElement(By.className("login-form-submit")).click();

    }

    @Then("se le muestra el formulario")
    public void SeMuestraFormulario() {


    }

    @Then("se registra su usuario")
    public void seRegistraUsuario() {


    }
}