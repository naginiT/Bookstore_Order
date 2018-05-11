package Execution;

import org.testng.annotations.Test;

import Actions.operations;
import Browser.browsercode;

public class execute {
	@Test
	public  void process() throws Exception {
		browsercode.Browser();
		operations.actions();
		browsercode.scrnsht();
		operations.taskstatus();
		
	}

}
