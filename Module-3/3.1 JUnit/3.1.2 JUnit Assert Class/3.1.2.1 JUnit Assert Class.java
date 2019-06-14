import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestJunit {
   @Test
   public void testAdd() {
      //test data
      int num= 5;
      String str= "Abc";

      //check for equality
      assertEquals("Abc", str);
      
      //check for false condition
      assertFalse(num > 6);

      //check for not null value
      assertNotNull(str);
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