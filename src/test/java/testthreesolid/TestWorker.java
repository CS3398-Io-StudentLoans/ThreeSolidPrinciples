package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.*;

public class TestWorker {

   	private Worker w = new Worker();
	private Robot r = new Robot();

   	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	public void cleanUpStreams() {
	    System.setOut(null);
	}

   	@Test
   	@DisplayName("Work Method Test")
	public void testWorkMethod() {
   		assertEquals(w.work(),"I am working..","Mismatch between test text and method text");

	}
	
	
	@Test
	@DisplayName("Pass Method Test")
	public void newtestjmWorkerPass(){
		assertTrue(r.outOfOil()); //this test passes because r.outOfOil is set to true
	}
	
	@Test
	@DisplayName("fail Method Test")
	public void newtestjmWorkerFail(){
		assertNull(r); //this test fails because r is not a null object
	}
}