package code.refactoring.methodsimple_7;

public class Account {
	private int _balance=100;
	
	void canWithdraw(int amount) {
			if (amount > _balance) throw new IllegalArgumentException("Amount too large!!");
	}

}
