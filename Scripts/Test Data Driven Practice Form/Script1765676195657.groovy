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

// Ambil data CSV
TestData data = findTestData("null")

for (def i = 1; i <= data.getRowNumbers(); i++) {

    WebUI.openBrowser('')
    WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')
    WebUI.maximizeWindow()

    // Set text
    WebUI.setText(OR.findTestObject('firstname_input'), data.getValue('firstname', i))
    WebUI.setText(OR.findTestObject('lastname_input'), data.getValue('lastname', i))
    WebUI.setText(OR.findTestObject('email_input'), data.getValue('email', i))
    WebUI.setText(OR.findTestObject('mobile_input'), data.getValue('mobile', i))

    // Gender
    if (data.getValue('gender', i) == "male") {
        WebUI.click(OR.findTestObject('gender_radio_male'))
    }

    // Submit
    WebUI.click(OR.findTestObject('button_submit'))

    // EXPECTATION CHECKING
    String expected = data.getValue('expected', i)

    switch (expected) {

        case "success":
            WebUI.verifyElementPresent(
                OR.findTestObject('modal_confirmation'),
                5,
                FailureHandling.CONTINUE_ON_FAILURE
            )
            break
		 case "firstname_error":
            WebUI.verifyElementPresent(
                OR.findTestObject('firstname_error'),
                5
            )
            break
		case "lastname_error":
			WebUI.verifyElementPresent(
				OR.findTestObject('lastname_error'),
				5
			)
			break

        case "email_error":
           WebUI.verifyElementPresent(
				OR.findTestObject('email_error'),
				5
            )
            break

        case "mobile_error":
            WebUI.verifyElementAttributeValue(
                OR.findTestObject('mobile_input'),
                'class',
                'mr-sm-2 field-error form-control',
                5
            )
            break

        case "mobile_error":
            WebUI.verifyElementPresent(
                OR.findTestObject('mobile_error'),
                5
            )
            break

        case "gender_error":
            WebUI.verifyElementPresent(
                OR.findTestObject('gender_error'),
                5
            )
            break
		case "email_error":
			WebUI.verifyElementAttributeValue(
				OR.findTestObject('email_input'),
				'class',
				'mr-sm-2 field-error form-control',
				5
			)
			break
    }

    WebUI.closeBrowser()
}