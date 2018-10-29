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
   	@DisplayName("newtest<BChamblee>WorkerPass")
	public void WorkerPass() {
   		 assertNotNull(w.work() == "I am working..", "This test pssses with assertTrue");
	}
	
	
	@Test
	@DisplayName("newtest<BChamblee>WorkerFail")
	public void WorkerFail(){
		 	assertFalse( "This test fails with assertFalse", w.work() == "I am working..");
	}
}