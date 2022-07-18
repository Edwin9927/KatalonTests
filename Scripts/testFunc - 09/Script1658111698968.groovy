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

Windows.startApplicationWithTitle('C:\\Users\\edwin\\Documents\\Dev\\python\\iniciar\\dist\\iniciar.exe', 'Iniciar')

Windows.click(findWindowsObject('Object Repository/iniciarReconocimiento/Pane'))

Windows.setText(findWindowsObject('Object Repository/iniciarReconocimiento/Pane'), '127.0.0.1:8080')

Windows.click(findWindowsObject('Object Repository/iniciarReconocimiento/Button'))

Windows.click(findWindowsObject('Object Repository/iniciarReconocimiento/TreeItem'))

Windows.doubleClick(findWindowsObject('Object Repository/iniciarReconocimiento/Edit'))

Windows.click(findWindowsObject('Object Repository/iniciarReconocimiento/ListItem'))

Windows.sendKeys(findWindowsObject('Object Repository/iniciarReconocimiento/ListItem'), Keys.chord(Keys.ENTER))

Windows.click(findWindowsObject('Object Repository/iniciarReconocimiento/ListItem(1)'))

Windows.sendKeys(findWindowsObject('Object Repository/iniciarReconocimiento/ListItem(1)'), Keys.chord(Keys.ENTER))

Windows.click(findWindowsObject('Object Repository/iniciarReconocimiento/Edit(1)'))

Windows.sendKeys(findWindowsObject('Object Repository/iniciarReconocimiento/Edit(1)'), Keys.chord(Keys.ENTER))

Windows.click(findWindowsObject('Object Repository/iniciarReconocimiento/ListItem(2)'))

Windows.sendKeys(findWindowsObject('Object Repository/iniciarReconocimiento/ListItem(2)'), Keys.chord(Keys.ENTER))

Windows.click(findWindowsObject('Object Repository/iniciarReconocimiento/ListItem(3)'))

Windows.sendKeys(findWindowsObject('Object Repository/iniciarReconocimiento/ListItem(3)'), Keys.chord(Keys.ENTER))

Windows.click(findWindowsObject('Object Repository/iniciarReconocimiento/Button(1)'))

Windows.click(findWindowsObject('Object Repository/iniciarReconocimiento/Button(2)'))

Windows.click(findWindowsObject('Object Repository/iniciarReconocimiento/Edit(2)'))

Windows.sendKeys(findWindowsObject('Object Repository/iniciarReconocimiento/ListItem(4)'), Keys.chord(Keys.ENTER))

Windows.click(findWindowsObject('Object Repository/iniciarReconocimiento/Image'))

Windows.sendKeys(findWindowsObject('Object Repository/iniciarReconocimiento/Image'), Keys.chord(Keys.ENTER))

Windows.click(findWindowsObject('Object Repository/iniciarReconocimiento/Button(3)'))

