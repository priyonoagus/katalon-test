import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mp-kholilurgent-staging.faspay.co.id/merchantpage/auth/login')

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Page_Welcome to Faspay Merchant Page/input_USER NAME_loginform-account'), 
    'agus')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Welcome to Faspay Merchant Page/input_PASSWORD_LoginFormpassword'), 
    '2cPXaoOGue96AIKXdy+oOg==')

WebUI.setText(findTestObject('Object Repository/Page_Welcome to Faspay Merchant Page/input_PASSWORD_loginform-captcha'), 
    '424332')

WebUI.click(findTestObject('Object Repository/Page_Welcome to Faspay Merchant Page/button_Login'))

WebUI.delay(30)

WebUI.navigateToUrl('https://mp-kholilurgent-staging.faspay.co.id/merchantpage/transaction')

WebUI.delay(20)

WebUI.scrollToPosition(12, 0)

WebUI.click(findTestObject('Object Repository/Page_Report/span_Financial Platform'))

WebUI.click(findTestObject('Object Repository/Page_Report/a_Dashboard'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Financial Platform Dashboard/select_-- Select Account --                _a474d6'), 
    '014-0613339253', true)

WebUI.delay(15)

WebUI.scrollToPosition(8, 0)

WebUI.click(findTestObject('Object Repository/Page_Financial Platform Dashboard/input_Filter_date_range'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Financial Platform Dashboard/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '10', true)

WebUI.click(findTestObject('Object Repository/Page_Financial Platform Dashboard/span_1'))

WebUI.click(findTestObject('Object Repository/Page_Financial Platform Dashboard/span_7'))

WebUI.delay(20)

WebUI.closeBrowser()

