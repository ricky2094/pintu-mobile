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

Mobile.startApplication('/Users/flp-9-rickynugroho/Katalon Studio/Pintu Test Mobile/Include/APK/Sample Android App - Login Tes_4.0_Apkpure.apk', 
    true)

Mobile.tap(findTestObject('Login page/BUTTON - register'), 0)

Mobile.tap(findTestObject('Register Page/BUTTON-register'), 0)

Mobile.verifyElementVisible(findTestObject('Register Page/ALERT- Enter Full Namew'), 0)

Mobile.setText(findTestObject('Register Page/INPUT-name'), GlobalVariable.name, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Register Page/BUTTON-register'), 0)

Mobile.verifyElementVisible(findTestObject('Register Page/ALERT - Enter Valid Email'), 0)

Mobile.setText(findTestObject('Register Page/INPUT-email'), GlobalVariable.validEmail, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Register Page/BUTTON-register'), 0)

Mobile.verifyElementVisible(findTestObject('Register Page/ALERT - Enter Password'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register Page/INPUT-password'), GlobalVariable.validPassword, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Register Page/BUTTON-register'), 0)

Mobile.verifyElementVisible(findTestObject('Register Page/ALERT - Password Does Not Matches'), 0)

