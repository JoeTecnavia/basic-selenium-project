package tests.browser.pageobjects

import org.fluentlenium.core.FluentPage
import org.fluentlenium.core.annotation.PageUrl
import org.fluentlenium.core.domain.FluentWebElement
import org.openqa.selenium.support.FindBy

@PageUrl("https://cullmantimes-cnhi.newsmemory.com/") // specifies getUrl()
//@FindBy(css=".enterprise-prompt") // specifies isAt()
open class AccountPage : FluentPage() {

   /* @FindBy(css = "input[name=q]")
    lateinit var searchField: FluentWebElement

    @FindBy(css = "button.i-button")
    lateinit var loginButton: FluentWebElement
*/

    //buttons
    @FindBy(css = "#ta_wallet_button")
    lateinit var addMoney: FluentWebElement

    @FindBy(css = "#ta_subscribe_button")
    lateinit var subscribe: FluentWebElement

    @FindBy(css = "#ta_periodPurchase_button")
    lateinit var dayPass: FluentWebElement

    @FindBy(css = "#ta_login_button")
    lateinit var loginButton: FluentWebElement

    @FindBy(css = "#ta_activate_button")
    lateinit var activateButton: FluentWebElement

    //tabs
    @FindBy(css = "#tabhome")
    lateinit var editionsTab: FluentWebElement

    @FindBy(css = "#tabaccount")
    lateinit var accountTab: FluentWebElement

    @FindBy(css = "#tabhelp")
    lateinit var helpTab: FluentWebElement

    @FindBy(css = "#tabcontact")
    lateinit var contactTab: FluentWebElement

    @FindBy(css = "#tabuberabos")
    lateinit var activateTab: FluentWebElement

    @FindBy(css = "#tabmarket")
    lateinit var printAdsTab: FluentWebElement

    @FindBy(css = "#tabsettings")
    lateinit var settingsTab: FluentWebElement

    @FindBy(css = "#lightbox-iframe")
    lateinit var mainFrame: FluentWebElement
}
