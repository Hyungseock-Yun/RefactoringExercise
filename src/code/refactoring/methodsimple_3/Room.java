package code.refactoring.methodsimple_3;

public class Room {
	boolean withinPlan(HeatingPlan plan) {
	    int low = daysTempRange().getLow();
	    int high = daysTempRange().getHigh();
	    return plan.withinRange(low, high);		//파라미터를 객체로 전환
	}
	
	TempRange daysTempRange() {   
		TempRange temp=new TempRange() ;  
		return temp;
	}

}
