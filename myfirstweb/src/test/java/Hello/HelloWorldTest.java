package Hello;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class HelloWorldTest {

	@Test
	public void test(){
		HelloWorld hw = new HelloWorld();
		assertEquals("Hello World", hw.message());
	}
	
}
