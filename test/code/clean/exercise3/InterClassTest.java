package code.clean.exercise3;

public class InterClassTest {

	public static void main(String[] args) {
		OracleDB dbDriver = new OracleDB();
		
		dbDriver.connection();
		dbDriver.runTransaction();
		dbDriver.commit(); 
	}


}
