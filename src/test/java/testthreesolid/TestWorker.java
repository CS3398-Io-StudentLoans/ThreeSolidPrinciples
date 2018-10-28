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
	@DisplayName("Pass Method Test")
	public void newtestRMWorkerPassl(){
		assertEquals(w.work(), "this is failing", "showing a fail test method");
	}
	
	
	@Test
	@DisplayName("Fail Method Test")
	public void newtestRMWorkerFail(){
		assertEquals(w.work(), "this is failing", "showing a fail test method");
	}
	
	
}