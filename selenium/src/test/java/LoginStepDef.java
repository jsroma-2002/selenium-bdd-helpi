import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pe.edu.upc.selenium.GenericWebDriver;

public class LoginStepDef {
    public static WebDriver webDriver;

    public LoginStepDef() {
        webDriver = GenericWebDriver.getWebDriver();
    }



    @Given("El usuario se encuentra en la pantalla de login")
    public void elUsuarioIngresaAlRegistro() {

        // Carga la pagina
        webDriver.get("https://helpi-app.netlify.app/");
        // --Maximiza la ventana
        webDriver.manage().window().maximize();
        webDriver.findElement(By.linkText("Login")).click();

    }


    @When("Hace click en el boton login")
    public void leHaceClickEnLogin() {

        webDriver.findElement(By.linkText("Login")).click();

    }

    @When("Completa sus datos de inicio de sesion")
    public void completarDatosLogin() {
        webDriver.findElement(By.id("user")).sendKeys("test@gmail.com");
        webDriver.findElement(By.id("password")).sendKeys("test");

        webDriver.findElement(By.className("login-form-submit")).click();
    }


    @Then("se le muestra el formulario login")
    public void SeMuestraFormularioLogin() {


    }

    @Then("se encuentra logeado")
    public void seEncuentraLogeado() {


    }
}