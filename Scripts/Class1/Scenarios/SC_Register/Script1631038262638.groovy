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

WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=authentication&back=my-account')

WebUI.setText(findTestObject('Object Repository/Class1/Page_Login/input_Email address_email_create'), findTestData('new_users').getValue(
        1, 3))

WebUI.click(findTestObject('Object Repository/Class1/Page_Login/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Class1/Page_Login/input_Mrs_id_gender'))

WebUI.setText(findTestObject('Object Repository/Class1/Page_Login/input__customer_firstname'), 'guisselle')

WebUI.setText(findTestObject('Object Repository/Class1/Page_Login/input__customer_lastname'), 'mendoza')

WebUI.setEncryptedText(findTestObject('Object Repository/Class1/Page_Login/input__passwd'), 'HADZinu5K4A=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Class1/Page_Login/select_-12345678910111213141516171819202122_51e29d'), 
    '18', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Class1/Page_Login/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Class1/Page_Login/select_-20212020201920182017201620152014201_28b437'), 
    '1999', true)

WebUI.setText(findTestObject('Object Repository/Class1/Page_Login/input__address1'), 'adress2')

WebUI.setText(findTestObject('Object Repository/Class1/Page_Login/input__city'), 'Miami')

WebUI.selectOptionByValue(findTestObject('Object Repository/Class1/Page_Login/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/Class1/Page_Login/input__postcode'), '60110')

WebUI.click(findTestObject('Object Repository/Class1/Page_Login/input_Home phone_phone'))

WebUI.setText(findTestObject('Object Repository/Class1/Page_Login/input__phone_mobile'), '78305425')

WebUI.setText(findTestObject('Object Repository/Class1/Page_Login/input__alias'), 'My address2')

WebUI.click(findTestObject('Object Repository/Class1/Page_Login/span_Register'))

WebUI.closeBrowser()

