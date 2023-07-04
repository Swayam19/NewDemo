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

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Women'))

WebUI.click(findTestObject('Object Repository/Page_Women/a_Bottoms'))

WebUI.click(findTestObject('Object Repository/Page_Bottoms - Women/img_Set Descending Direction_product-image-photo'))

WebUI.click(findTestObject('Object Repository/Page_Erika Running Short/div_30'))

WebUI.click(findTestObject('Object Repository/Page_Erika Running Short/div_Color_option-label-color-93-item-58'))

WebUI.setText(findTestObject('Object Repository/Page_Erika Running Short/input_Qty_qty'), '1')

WebUI.click(findTestObject('Object Repository/Page_Erika Running Short/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Erika Running Short/div_You added Erika Running Short to your s_6cdd51'))

WebUI.click(findTestObject('Object Repository/Page_Erika Running Short/span_1'))

WebUI.click(findTestObject('Object Repository/Page_Erika Running Short/button_Proceed to Checkout'))

WebUI.verifyTextPresent('Proceed to checkout', false)

