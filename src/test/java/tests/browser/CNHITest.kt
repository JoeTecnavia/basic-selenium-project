package tests.browser
import config.BrowserTest
import config.annotations.Browser
import config.annotations.Screenshot
import config.driver.Breakpoint
import io.qameta.allure.Description
import org.fluentlenium.assertj.FluentLeniumAssertions.assertThat
import org.fluentlenium.core.annotation.Page
import org.fluentlenium.core.wait.FluentWait
import org.junit.jupiter.api.Test
import tests.browser.pageobjects.AccountPage
import java.util.concurrent.TimeUnit
import org.openqa.selenium.By
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement
import org.fluentlenium.core.conditions.wait.WaitConditionProxy.element




@Browser(dimension = Breakpoint.XLARGE)
@Screenshot
class CNHITest : BrowserTest() {

    @Page
    lateinit var page: AccountPage

    @Test
    fun `makes sure that all of the buttons are present`() {
        goTo(page)
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
        driver.switchTo().frame("mainframe")
        driver.switchTo().frame("lightbox-iframe")
        driver.switchTo().frame("frameAccount")
        assertThat(page.loginButton).isDisplayed
        assertThat(page.addMoney).isDisplayed
        assertThat(page.subscribe).isDisplayed
        assertThat(page.dayPass).isDisplayed
        assertThat(page.activateButton).isDisplayed

    }

    @Test
    fun `log in successfully`() {
        goTo(page)
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
        driver.switchTo().frame("mainframe")
        driver.switchTo().frame("lightbox-iframe")
        driver.switchTo().frame("frameAccount")
        assertThat(page.loginButton).isDisplayed
        assertThat(page.loginButton).isClickable
        assertThat(page.loginButton.click())

        assertThat(page.username.modifyAttribute("value","tecnaviapress"))
        //driver.findElement(By.cssSelector(page.username.toString())).sendKeys("tecnaviapress")
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
        assertThat(page.submitButton.click())
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
        assertThat(page.password.modifyAttribute("value","12qw12qw"))
        assertThat(page.finalLoginButton.click())
        Thread.sleep(10000)
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
        driver.switchTo().frame("mainframe")
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
        page.optionsIcon.click()
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
        //driver.switchTo().frame("mainframe")
        driver.switchTo().frame("lightbox-iframe")
        driver.switchTo().frame("frameAccount1")

        assertThat(page.logoutButton).isDisplayed


    }
}