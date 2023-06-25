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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ec2-34-194-6-57.compute-1.amazonaws.com/quent-pre-user-trail/#/pages/dashboard/put/usertrail')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/div__mat-select-arrow-wrapper ng-tns-c121-1'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_91'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__login-phonenumber'), '9022351287')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__login-password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/img_PUT Data_date-picker ng-tns-c113-4'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_QT Interval_mat-focus-indicator mat-_25192e'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_QT Interval_mat-focus-indicator mat-_25192e'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/div_3'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_CM'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_Kg'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input_Channel_mat-input-6'), 'Manual')

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input_Vital Type_mat-input-7'), 'Hr')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_24 hour'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_12 hour'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/div_Export'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_CSV'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/img'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/div_Logout'))

WebUI.closeBrowser()

