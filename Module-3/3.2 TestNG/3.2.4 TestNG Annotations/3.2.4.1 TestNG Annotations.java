package automationFramework;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class Sequencing {

		@Test

		public void testCase1() {

			System.out.println("This is the Test Case 1");

		}

		@Test

		public void testCase2() {

			System.out.println("This is the Test Case 2");

		}
//The annotated method will be run before each test method.
		@BeforeMethod

		public void beforeMethod() {

			System.out.println("This will execute before every Method");

		}
//The annotated method will be run after each test method.
		@AfterMethod

		public void afterMethod() {

			System.out.println("This will execute after every Method");

		}
//The annotated method will be run only once before the first test method in the current class is //invoked.

		@BeforeClass

		public void beforeClass() {

			System.out.println("This will execute before the Class");

		}
//The annotated method will be run only once after all the test methods in the current class have run.

		@AfterClass

		public void afterClass() {

			System.out.println("This will execute after the Class");

		}
//The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.

		@BeforeTest

		public void beforeTest() {

			System.out.println("This will execute before the Test");

		}
//The annotated method will be run only once after all the test methods in the current class have run.

		@AfterTest

		public void afterTest() {

			System.out.println("This will execute after the Test");

		}
//The annotated method will be run only once before all tests in this suite have run.

		@BeforeSuite

		public void beforeSuite() {

			System.out.println("This will execute before the Test Suite");

		}
//The annotated method will be run only once after all tests in this suite have run.

		@AfterSuite

		public void afterSuite() {

			System.out.println("This will execute after the Test Suite");

		}

	}