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

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Email_loginusername'), 's.nayak1490@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login/input_Password_loginpassword'), 'saPQJV1Oprg5L5yPR1lTTQ==')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/span_Shorts_ui-menu-icon ui-icon ui-icon-carat-1-e'))

WebUI.click(findTestObject('Object Repository/Page_Men/a_Tops'))

WebUI.click(findTestObject('Object Repository/Page_Tops - Men/img_Add to Compare_product-image-photo'))

WebUI.click(findTestObject('Object Repository/Page_Atlas Fitness Tank/div_M'))

WebUI.click(findTestObject('Object Repository/Page_Atlas Fitness Tank/div_Color_option-label-color-93-item-50'))

WebUI.setText(findTestObject('Object Repository/Page_Atlas Fitness Tank/input_Qty_qty'), '1')

WebUI.click(findTestObject('Object Repository/Page_Atlas Fitness Tank/span_Add to Cart'))

WebUI.verifyTextPresent('You added', false)

