package code.clean.sample.performance;

public class StringTimeCompare {

	final static String addString = "abcde";
	
	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			String normalString = new String();
			StringBuffer bufferString = new StringBuffer();
			StringBuilder builderString = new StringBuilder();
			
			CompareTimer timer = new CompareTimer("normalString");
			for(int loop=0; loop < 10000; loop++) {
				normalString += addString;
			}
			timer.checkCurrentTimeMillis();
			
			CompareTimer buffer_timer = new CompareTimer("bufferString");
			for(int loop=0; loop < 10000; loop++) {
				bufferString.append(addString);
			}
			buffer_timer.checkCurrentTimeMillis();
			
			CompareTimer builder_timer = new CompareTimer("builderString");
			for(int loop=0; loop < 10000; loop++) {
				builderString.append(addString);
			}
			builder_timer.checkCurrentTimeMillis();
		}

	}

}
