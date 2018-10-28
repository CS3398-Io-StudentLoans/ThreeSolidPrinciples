package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.*;

public class TestWorker {

   	private Worker w = new Worker();
   	private SuperWorker s = new SuperWorker();
   	private TempWorker t = new TempWorker();

   	@Test
   	@DisplayName("Work Method Test")
	public void testWorkMethod() {
   		assertEquals(w.work(),"I am working..","Mismatch between test text and method text");

	}
	
	
	@Test
	@DisplayName("Pass Method Test")
	public void newtestRMWorkerPass(){
		assertFalse(t.eat(), "showing a pass test method. Passed because eat is false, making statement true");
	}
	
	
	@Test
	@DisplayName("Fail Method Test")
	public void newtestRMWorkerFail(){
		assertTrue(s.sick(), "showing a fail test method. Failed becuase sick is false, making statement false");
	}
	
	
}