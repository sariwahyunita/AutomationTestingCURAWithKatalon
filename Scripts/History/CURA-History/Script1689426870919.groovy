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

WebUI.click(findTestObject('Menu/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Menu/a_History'))

WebUI.waitForElementPresent(findTestObject('Page_History/h2_History'), 0)

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Page_History/h2_History'), 'History')

WebUI.verifyElementText(findTestObject('Page_History/div_visit date_first card'), '01/07/2023')

WebUI.verifyElementText(findTestObject('Page_History/p_Facility_first card'), 'Hongkong CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('Page_History/p_Apply for hospital readmission_first card'), 'Yes')

WebUI.verifyElementText(findTestObject('Page_History/p_Healthcare Program_first card'), 'Medicaid')

WebUI.verifyElementText(findTestObject('Page_History/p_comment_first card'), 'Test 1')

