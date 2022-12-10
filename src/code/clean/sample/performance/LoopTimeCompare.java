package code.clean.sample.performance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LoopTimeCompare {
	
    private static final int LOOP_COUNT = 10000;
	TreeSet treeSetInit;
	
	public static void main(String[] args) {
		LoopTimeCompare forLoopTest = new LoopTimeCompare();
		forLoopTest.forloopSample();
		forLoopTest.forloopModify();
	}
	
	public LoopTimeCompare() {
		treeSetInit = new TreeSet();
		for(int loop=0; loop < LOOP_COUNT; loop++) {
			treeSetInit.add(new Integer(loop));
		}
	}
	
	public void forloopSample() {
		TreeSet treeSetSample = null;
		treeSetSample = treeSetInit;
		
		CompareTimer timer = new CompareTimer("forloopSample");
		if(treeSetSample != null) {
			int[] treeNum = new int[treeSetSample.size()];
			for(int i=0; i<treeSetSample.size(); i++) {
				 treeNum[i] = (int)treeSetSample.toArray()[i]; 
				 
			}
		}
		timer.checkCurrentTimeMillis();
	}
	
	public void forloopModify() {
		TreeSet treeSetSample = null;
		treeSetSample = treeSetInit;
		
		CompareTimer timer = new CompareTimer("forloopModify");
		if(treeSetSample != null) {
			int[] treeNum = new int[treeSetSample.size()];
			int treeSetSampleSize = treeSetSample.size();
			Iterator<Integer> iterator = treeSetSample.iterator();
			
			for(int i=0; i<treeSetSampleSize; i++) {
				treeNum[i] = (int)iterator.next();
			   
			}
		}
		timer.checkCurrentTimeMillis();
	}

}
