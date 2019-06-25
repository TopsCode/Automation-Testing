Sometimes, it happens that our code is not ready and the test case written to test that method/code fails. In such cases, annotation @Test(enabled = false) helps to disable this test case.
If a test method is annotated with @Test(enabled = false), then the test case that is not ready to test is bypassed.
Now, let's see @Test(enabled = false) in action.
Create a Class
Create a java class to be tested, say, MessageUtil.java in C:\>TestNG_WORKSPACE.
/*
* This class prints the given message on console.
*/

public class MessageUtil {

   private String message;

   //Constructor
   //@param message to be printed
   public MessageUtil(String message) {
      this.message = message; 
   }

   // prints the message
   public String printMessage() {
      System.out.println(message);
      return message;
   }   

   // add "Hi!" to the message
   public String salutationMessage() {
      message = "Hi!" + message;
      System.out.println(message);
      return message;
   }   
}  
Create Test Case Class
•	Create a java test class, say, IgnoreTest.java.
•	Add test methods, testPrintMessage(), and, testSalutationMessage(), to your test class.
•	Add an Annotation @Test(enabled = false) to the method testPrintMessage().
Create a java class file named IgnoreTest.java in C:\>TestNG_WORKSPACE.
import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoreTest {
   String message = "Manisha";
   MessageUtil messageUtil = new MessageUtil(message);

   @Test(enabled = false)
   public void testPrintMessage() {
      System.out.println("Inside testPrintMessage()");
      message = "Manisha";
      Assert.assertEquals(message, messageUtil.printMessage());
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Manisha";
      Assert.assertEquals(message, messageUtil.salutationMessage());
   }
}
Create testng.xml
Create testng.xml in C:\>TestNG_WORKSPACE to execute test case(s).
<?xml version = "1.0" encoding = "UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >

<suite name = "Suite1">
   <test name = "test1">
      <classes>
         <class name = "IgnoreTest" />
      </classes>
   </test>
</suite>	
Compile the MessageUtil and test case classes using javac.
C:\TestNG_WORKSPACE>javac MessageUtil.java IgnoreTest.java
Now, run the testng.xml, which will not run testPrintMessage() the test case defined in provided the Test Case class.
C:\TestNG_WORKSPACE>java -cp "C:\TestNG_WORKSPACE" org.testng.TestNG testng.xml
Verify the output. testPrintMessage() test case is not tested.
Inside testSalutationMessage()
Hi!Manisha

===============================================
Suite1
Total tests run: 1, Failures: 0, Skips: 0
===============================================
