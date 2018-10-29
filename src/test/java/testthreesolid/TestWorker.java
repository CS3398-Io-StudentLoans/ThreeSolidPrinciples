package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.*;

public class TestWorker {

   	private Worker w = new Worker();

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
	@DispayName("Pass Method Test")
	public void newtestjmWorkerPass().(){
		assertTrue(w.work(), "this test is passing");
	}
}