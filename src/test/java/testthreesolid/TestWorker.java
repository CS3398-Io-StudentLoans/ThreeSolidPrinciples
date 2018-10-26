package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.*;

public class TestWorker {

   	private Worker w = new Worker();

   	@Test
   	@DisplayName("Work Method Test")
	public void testWorkMethod() {
   		assertEquals(w.work(),"I am working..","Mismatch between test text and method text");
	}
   	
   	@Test
   	@DisplayName("Pass work Method Test with assertTrue")
	public void testPass() {
   		assertTrue(w.work() == "I am working..", "This test pssses with assertTrue");
	}
	
	
	@Test
	@DisplayName("Fail work Method Test with assertNull")
	public void testFail(){
		assertNull(w.work(), "This test fails with assertNull");
	}
}