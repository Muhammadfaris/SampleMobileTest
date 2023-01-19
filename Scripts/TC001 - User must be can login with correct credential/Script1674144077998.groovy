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

Mobile.startApplication('androidApps/stagingcicle.apk', false)

Mobile.waitForElementPresent(findTestObject('Button Sign With Google'), 0)

Mobile.tap(findTestObject('Button Sign With Google'), 0)

Mobile.waitForElementPresent(findTestObject('Sign in Account 01'), 0)

Mobile.tap(findTestObject('Sign in Account 01'), 0)

Mobile.waitForElementPresent(findTestObject('Button Continue Sign In With Google Account'), 30)

Mobile.tap(findTestObject('Button Continue Sign In With Google Account'), 30)

Mobile.waitForElementPresent(findTestObject('Text Cicle on Home Page'), 30)

Mobile.verifyElementExist(findTestObject('Text Cicle on Home Page'), 30)

Mobile.closeApplication()

