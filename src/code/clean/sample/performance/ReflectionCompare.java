package code.clean.sample.performance;

import java.math.BigDecimal;

public class ReflectionCompare {
	
	int LOOP_COUNT;
	String className;
	public static void main(String[] args) {
		ReflectionCompare reflectionTest = new ReflectionCompare();
		reflectionTest.withEquals();
		reflectionTest.withInstanceof();
		
	}
	
	public ReflectionCompare() {
		this.LOOP_COUNT = 10000;
		this.className = "";
	}
	
	public void withEquals() {
		CompareTimer timer = new CompareTimer("withEquals");
		Object objectSrc = new BigDecimal("3");
		for(int i=0; i < LOOP_COUNT; i++) {
			if(objectSrc.getClass().getName().equals("java.math.BigDecimal")) {
				className = "BigDecimal";
			}
		}
		timer.checkCurrentTimeMillis();
	}
	
	public void withInstanceof() {
		CompareTimer timer = new CompareTimer("withInstanceof");
		Object objectSrc = new BigDecimal("3");
		for(int i=0; i < LOOP_COUNT; i++) {
			if(objectSrc instanceof java.math.BigDecimal) {
				className = "BigDecimal";
			}
		}
		timer.checkCurrentTimeMillis();
	}

}
