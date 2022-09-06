package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.SalesLoginPage;

public class TC001_VerifyQuestion extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Verify Question";
		testDescription ="Post a new question";
		authors="Ajay";
		category ="Smoke";
		excelFileName="Sales";
	}
	
	@Test(dataProvider = "fetchData")
	public void runVerifyQuestion(String username, String password, String question, String details){
		new SalesLoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickIcon()
		.clickViewAll()
		.searchContent()
		.clickContent()
		.clickChatter()
		.verifyChatterTitle()
		.clickQuestion()
		.enterQuestion(question)
		.enterDetails(details)
		.clickAsk()
		.verifyChatterTitle();

	}

}
