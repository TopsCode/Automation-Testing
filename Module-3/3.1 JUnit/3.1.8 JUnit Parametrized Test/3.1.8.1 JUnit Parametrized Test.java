import static org.junit.Assert.assertEquals;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class TestJunit {
     private Integer inputNumber;
     private Boolean expectedResult;
     private BusinessLogic logic;

     @Before
     public void initialize() {
        logic = new BusinessLogic();
     }

     public TestJunit(Integer inputNumber, 
        Boolean expectedResult) {
       System.out.println("TestJunit-> inputNumber:"+inputNumber+" expectedResult:"+expectedResult);
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
     }

     @Parameterized.Parameters
     public static Collection primeNumbers() {
       System.out.println("primeNumbers() is called");
        return Arrays.asList(new Object[][] {
           { 2, true },
           { 6, false },
           { 19, true },
           { 22, false },
           { 23, true }
        });
     }

     @Test
     public void testPrimeNumberChecker() {
        System.out.println("Parameterized Number is : " + inputNumber);
        assertEquals(expectedResult, logic.validate(inputNumber));
     }

}

public class Main {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestJunit.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}