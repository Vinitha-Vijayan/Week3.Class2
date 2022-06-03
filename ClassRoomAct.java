package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomAct {
	
	
//	Classroom Exercise
//	1) Launch chrome and go to http://www.leafground.com/pages/Link.html
//	2) Get all the links (using findElements)
//	3) Click on the first link (using get method with index as 0)
//	4) Print the title
//	5) Navigate back on the browser (driver.navigate().back())
//	6) Get all the links again (using findElements)
//	7) Print the count of the links (size)
//	8) print the href value (getAttribute) of the second link
//	Time: 20 Minutes (max)



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step1:setup driver
		WebDriverManager.chromedriver().setup();
		
		//Step2. Open browser 
		
		ChromeDriver driver = new ChromeDriver ();
		
		//Step3 Load url
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		//Step 4 Implict wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Step 5 Maximize window 
		
		driver.manage().window().maximize();
		
		//Step 6 Get all the links using list -cntrl +2 and the select L
		
		List<WebElement> allUrls = driver.findElements(By.tagName("a"));
		
		// step 7 
		 WebElement firstLink = allUrls.get(0);
		 firstLink.click();;
		 
		 //step 8
		 System.out.println(driver.getTitle());
		//step 9
		 
		 driver.navigate().back();
		 
		 //step 10
		 List<WebElement> allUrls1 = driver.findElements(By.tagName("a"));
		 
		 //step 11
		 System.out.println(allUrls1.size());
		//step 12
		 
		 System.out.println(allUrls1.get(1).getAttribute("href"));
	
		
	}

}
