package code.clean.sample.performance;

import java.util.ArrayList;
import java.util.HashMap;

public class CompareTimer {

	long startTime;
	String testObject;
	long endTime;
	 
	public CompareTimer(String testObject) {
		this.startTime = System.currentTimeMillis();
		this.testObject = testObject;
	}

	public void checkCurrentTimeMillis() {
		this.endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		System.out.println(testObject + " 처리시간은= " + elapsedTime + " mili second");
	}

}
