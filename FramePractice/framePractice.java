package FramePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framePractice {

	@Test
	public void testFramePractice() {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		try {
			driver.get("https://www.bell.ca/");
			WebElement bannerBtn = driver.findElement(By.id("Mob_LOB"));
			bannerBtn.click();

			WebElement iPhone15 = driver
					.findElement(By.xpath("//*[@id=\"details_item_6ad6b06c-905e-4de6-9e7b-a6ae808e01b1\"]"));
			iPhone15.click();

			WebElement selectTheManufacture = driver.findElement(By.id("list-manufacturer"));
			selectTheManufacture.sendKeys("Apple");

			WebElement listModelDropdown = driver.findElement(By.id("list-model"));
			listModelDropdown.sendKeys("Apple iPhone 13 512GB");

			driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[4]/div/input"))
					.sendKeys("Build your plan");

			WebElement imNewToBell = driver.findElement(By.xpath("//*[@id=\"track\"]/div[1]/div[1]"));
			imNewToBell.click();

			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			WebElement deviceReturnOption = driver.findElement(By.id("smartPay-option-0"));
			deviceReturnOption.click();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement acknowledge = driver.findElement(By.id("acknowledge"));
			acknowledge.click();
			
			
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			WebElement nextStepOne = driver.findElement(By.id("next-step-button-1"));
			nextStepOne.click();

			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			WebElement nextStepTwo = driver.findElement(By.id("next-step-button-2"));
			nextStepTwo.click();

			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			WebElement nextStepThree = driver.findElement(By.id("next-step-button-3"));
			nextStepThree.click();

			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			WebElement addToShoppingCart = driver.findElement(By.id("add-to-shopping-cart"));
			addToShoppingCart.click();

			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			WebElement linkAddToShoppingCart = driver.findElement(By.id("lnkAddToCartModalGoToCart"));
			linkAddToShoppingCart.click();

			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			WebElement proceedToCheckout = driver.findElement(By.id("next-step-button-undefined"));
			proceedToCheckout.click();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
						
			WebElement userName = driver
					.findElement(By.id("PersonalInformation_CustomerInformationViewModel_FirstName"));
			WebElement lastName = driver
					.findElement(By.id("PersonalInformation_CustomerInformationViewModel_LastName"));
			WebElement streetAddress = driver
					.findElement(By.id("PersonalInformation_BillingInformationViewModel_StreetAddress"));
			WebElement emailAddress = driver
					.findElement(By.id("PersonalInformation_CustomerInformationViewModel_EmailAddress"));
			WebElement conformEmailAddress = driver
					.findElement(By.id("PersonalInformation_CustomerInformationViewModel_ConfirmEmailAddress"));
			WebElement phoneNumber = driver
					.findElement(By.id("PersonalInformation_BillingInformationViewModel_PhoneNumber"));

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			userName.sendKeys("Archi");
			lastName.sendKeys("Baroi");
			streetAddress.sendKeys("143 Northover St, North York, ON, M3L 1W8");
			emailAddress.sendKeys("archibaroi@aol.com");
			conformEmailAddress.sendKeys("archibaroi@aol.com");
			phoneNumber.sendKeys("6478822175");

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement continueToNumberSetup = driver.findElement(By.id("id_SHIPPINGBILLING_CUSTOMERINFO_NEXT_LABEL"));
			continueToNumberSetup.click();

			WebElement confirm = driver
					.findElement(By.xpath("//*[@id=\"confirm-information\"]/div/div/div[2]/div/div[2]/button/span"));
			confirm.click();

			// switching the window
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://demoqa.com/frames");
			driver.manage().window().maximize();
			workWithIframeUsingIndex(driver);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			driver.quit();
		}
	}

	private void workWithIframeUsingIndex(EdgeDriver driver) {
		driver.switchTo().frame(0);
		WebElement sampleText = driver.findElement(By.id("sampleHeading"));
		String text = sampleText.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
	}
}
