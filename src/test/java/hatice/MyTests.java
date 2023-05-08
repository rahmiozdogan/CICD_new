package hatice;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyTests {

	 @Test
	  public void testMyMethod1() {
	    MyClass myObject = new MyClass();
	    String result = myObject.myMethod();
	    assertNotEquals("Hello, Dunya!", result);
    }
	 
	 @Test
	  public void testMyMethod2() {
	    MyClass myObject = new MyClass();
	    String result = myObject.myMethod();
	    assertEquals("Hello, Junit!", result);
   }

}
