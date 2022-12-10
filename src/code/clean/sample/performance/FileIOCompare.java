package code.clean.sample.performance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileIOCompare {

	public static void main(String[] args) throws Exception {
		String fileName = "C:/filereadtest2.pptx";
		
		ArrayList basicFileIO = FileIOCompare.readCharStream(fileName);
		String bufferFileIO = FileIOCompare.readCharStreamWithBuffer(fileName);
		ArrayList bufferReaderIO = FileIOCompare.readBufferedReader(fileName);

	}
	
	public static ArrayList readCharStream(String fileName) throws Exception {
		ArrayList<StringBuffer> list = new ArrayList<StringBuffer>();
		FileReader fReader = null;
		CompareTimer timer = new CompareTimer("basicFileIO");
		
		try {
			fReader = new FileReader(fileName);
			int data = 0;
			
			StringBuffer sb = new StringBuffer();
			while((data=fReader.read()) != -1) {
				if(data=='\n' || data=='\r') {
					list.add(sb);
					sb = new StringBuffer();
				}
				else {
					sb.append((char)data);
				}
			}
		} catch(IOException e) {
			System.err.println(e.getMessage());
			throw e;			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			throw e;				
		} finally {
			if(fReader != null) fReader.close();
		}
		
		timer.checkCurrentTimeMillis();
		return list;
	}
	
	public static String readCharStreamWithBuffer(String fileName) throws Exception {
		StringBuffer returnSB = new StringBuffer();
		FileReader fReader = null;
		CompareTimer timer = new CompareTimer("bufferFileIO");
		
		try {
			fReader = new FileReader(fileName);
			int bufferSize = 1024*1024;
			char readBuffer[] = new char[bufferSize];
			int resultSize = 0;
			
			while((resultSize = fReader.read(readBuffer)) != -1) {
				if(resultSize == bufferSize) {
					returnSB.append(readBuffer);
				} else {
					for(int i=0; i<resultSize; i++) {
						returnSB.append(readBuffer[i]);
					}
				}
			}
		} catch(IOException e) {
			System.err.println(e.getMessage());
			throw e;			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			throw e;				
		} finally {
			if(fReader != null) fReader.close();
		}
		timer.checkCurrentTimeMillis();
		return returnSB.toString();
	}
	
	public static ArrayList<String> readBufferedReader(String fileName) throws Exception {
		ArrayList<String> returnList = new ArrayList<String>();
		BufferedReader bfReader = null;
		CompareTimer timer = new CompareTimer("bufferReaderFileIO");
		try {
			bfReader = new BufferedReader(new FileReader(fileName));
			String data;
			while((data=bfReader.readLine()) != null) {
				returnList.add(data);
			}
		} catch(IOException e) {
			System.err.println(e.getMessage());
			throw e;			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			throw e;				
		} finally {
			if(bfReader != null) bfReader.close();
		}
		timer.checkCurrentTimeMillis();
		return returnList;
		
	}

}
