Create a java class file named ParameterizedTest1.java in C:\>TestNG_WORKSPACE
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {
   @Test
   @Parameters("myName")
   public void parameterTest(String myName) {
      System.out.println("Parameterized value is : " + myName);
   }
}
Create testng.xml
Create testng.xml in C:\>TestNG_WORKSPACE to execute test case(s).
<?xml version = "1.0" encoding = "UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >

<suite name = "Suite1">
   <test name = "test1">
   
      <parameter name = "myName" value="manisha"/> 
      
      <classes>
         <class name = "ParameterizedTest1" />
      </classes>
      
   </test>
</suite>

Create Java class
Create a java class called PrimeNumberChecker.java. This class checks if the number is prime. Create this class in C:\>TestNG_WORKSPACE.
public class PrimeNumberChecker {
   public Boolean validate(final Integer primeNumber) {
   
      for (int i = 2; i < (primeNumber / 2); i++) {
         if (primeNumber % i == 0) {
            return false;
         }
      }
      return true;
   }
}

Create a java class file named ParamTestWithDataProvider1.java in C:\>TestNG_WORKSPACE.
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamTestWithDataProvider1 {
   private PrimeNumberChecker primeNumberChecker;

   @BeforeMethod
   public void initialize() {
      primeNumberChecker = new PrimeNumberChecker();
   }

   @DataProvider(name = "test1")
   public static Object[][] primeNumbers() {
      return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test(dataProvider = "test1")
   public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
      System.out.println(inputNumber + " " + expectedResult);
      Assert.assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
   }
}
Create testng.xml
Create a testng.xml C:\>TestNG_WORKSPACE to execute Test case(s).
<?xml version = "1.0" encoding = "UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >

<suite name = "Suite1">
   <test name = "test1">
      <classes>
         <class name = "ParamTestWithDataProvider1" />
      </classes>
   </test>
</suite>

Create a java class Bean.java, which is a simple object with get/set methods, in C:\>TestNG_WORKSPACE.
public class Bean {
   private String val;
   private int i;
   
   public Bean(String val, int i) {
      this.val = val;
      this.i = i;
   }
   
   public String getVal() {
      return val;
   }
   
   public void setVal(String val) {
      this.val = val;
   }
   
   public int getI() {
      return i;
   }
   
   public void setI(int i) {
      this.i = i;
   }
}
Create a java class file named ParamTestWithDataProvider2.java in C:\>TestNG_WORKSPACE.
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamTestWithDataProvider2 {
   @DataProvider(name = "test1")
   public static Object[][] primeNumbers() {
      return new Object[][] { { new Bean("hi I am the bean", 111) } };
   }

   @Test(dataProvider = "test1")
   public void testMethod(Bean myBean) {
      System.out.println(myBean.getVal() + " " + myBean.getI());
   }
}
Create testng.xml
Create testng.xml in C:\>TestNG_WORKSPACE to execute test case(s).
<?xml version = "1.0" encoding = "UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >

<suite name = "Suite1">
   <test name = "test1">
      <classes>
         <class name = "ParamTestWithDataProvider2" />
      </classes>
   </test>
</suite>
