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

WebUI.navigateToUrl('https://demoqa.com/forms')

WebUI.click(findTestObject('Object Repository/TC05/Page_DEMOQA/li_Practice Form'))

WebUI.setText(findTestObject('Object Repository/TC05/Page_DEMOQA/input_Name_firstName'), 'Rahmat')

WebUI.setText(findTestObject('Object Repository/TC05/Page_DEMOQA/input_Name_lastName'), 'Luthfi')

WebUI.setText(findTestObject('Object Repository/TC05/Page_DEMOQA/input_Email_userEmail'), 'rahmat@gmail.com')

WebUI.click(findTestObject('Object Repository/TC05/Page_DEMOQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/TC05/Page_DEMOQA/input_(10 Digits)_userNumber'), 'Abcdefghij')

WebUI.setText(findTestObject('Object Repository/TC05/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), '14 Dec 2025')

WebUI.click(findTestObject('Object Repository/TC05/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.click(findTestObject('Object Repository/TC05/Page_DEMOQA/div_15'))

WebUI.click(findTestObject('Object Repository/TC05/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/TC05/Page_DEMOQA/input_Subjects_subjectsInput'), 'Art')

WebUI.click(findTestObject('Object Repository/TC05/Page_DEMOQA/div_Arts'))

WebUI.click(findTestObject('Object Repository/TC05/Page_DEMOQA/label_Sports'))

WebUI.setText(findTestObject('Object Repository/TC05/Page_DEMOQA/textarea_Current Address_currentAddress'), 'Setiabudi')

WebUI.click(findTestObject('Object Repository/TC05/Page_DEMOQA/div_Select State_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/TC05/Page_DEMOQA/div_NCR'))

WebUI.click(findTestObject('Object Repository/TC05/Page_DEMOQA/div_Select City_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/TC05/Page_DEMOQA/div_Delhi'))

WebUI.click(findTestObject('Object Repository/TC05/Page_DEMOQA/button_Submit'))

