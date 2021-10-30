package Pages_Test;



import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseFrame.Page_Abstraction;
import BaseFrame.BaseFrame;



public class TestFrame {
	
	static WebDriver driver;
	public static Page_Abstraction page;
	public static String projectPath= System.getProperty("user.dir");
	public static String driversPath= projectPath+File.separator+"Resources/";
	public static String reportPath= projectPath+File.separator+"Reports/";
	public static String screenshotsPath= projectPath+File.separator+"Screenshots/";
	
	public static ExtentSparkReporter reports;
	public static ExtentTest logger;
	public static ExtentReports extent;
	
	@BeforeSuite
	public void initilizeReporting() {
		reports= new ExtentSparkReporter(reportPath+"Report_"+getCurrDate()+".html");
		extent= new ExtentReports();
		extent.attachReporter(reports);
	}
	
	
	@BeforeMethod
	@Parameters({"browser","url"})
	public static void initilizeBrowser(String browser, String url,Method method) {
		try {
			logger= extent.createTest(method.getName());
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",driversPath+"chromedriver.exe");
				driver= new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.chrome.driver",driversPath+"msedgedriver.exe");
				driver= new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver",driversPath+"geckodriver.exe");
				driver= new FirefoxDriver();
			}
			else {
				driver= new ChromeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get(url);
			page= new BaseFrame(driver);
		}
		catch(WebDriverException e) {
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		try {
			if(result.getStatus()==ITestResult.SUCCESS) {
				String methodName= result.getMethod().getMethodName();
				String methodDesc= result.getMethod().getDescription();
				Markup m= MarkupHelper.createUnorderedList(Arrays.asList(new String[]{
					"Test Method : "+methodName,"Test Description : "+methodDesc,"Test Status : "+"Success!!!"
				}));
				logger.log(Status.PASS, m);
			}
			else if(result.getStatus()==ITestResult.FAILURE) {
				String methodName= result.getMethod().getMethodName();
				String methodDesc= result.getMethod().getDescription();
				String remark= result.getThrowable().getMessage();
				Markup m= MarkupHelper.createUnorderedList(Arrays.asList(new String[]{
					"Test Method : "+methodName,"Test Description : "+methodDesc,"Test Status : "+"Failed!!!","Reason : "+remark
				}));
				getScreenshot(methodName);
				logger.log(Status.FAIL, m);
			}
			
			else if(result.getStatus()==ITestResult.SKIP) {
				String methodName= result.getMethod().getMethodName();
				String methodDesc= result.getMethod().getDescription();
				String remark= result.getThrowable().getMessage();
				Markup m= MarkupHelper.createUnorderedList(Arrays.asList(new String[]{
					"Test Method : "+methodName,"Test Description : "+methodDesc,"Test Status : "+"Failed!!!","Reason : "+remark
				}));
				getScreenshot(methodName);
				logger.log(Status.SKIP, m);
			}
			
			
			driver.quit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
		
	@AfterSuite
	public void endBrowserInstance() {
		extent.flush();
	}
	
		
	public String getCurrDate() {
		SimpleDateFormat format= new SimpleDateFormat("mmddyy_HH_MM_ss");
		Date date= new Date();
		String dateStr= format.format(date);
		return dateStr;
	}
	
	public void getScreenshot(String fileName) {
		try {
			TakesScreenshot ss= (TakesScreenshot)driver;
			File ssFile= ss.getScreenshotAs(OutputType.FILE);
			File saveSS= new File(screenshotsPath+fileName+"_"+".png");
			FileUtils.copyFile(ssFile, saveSS);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
