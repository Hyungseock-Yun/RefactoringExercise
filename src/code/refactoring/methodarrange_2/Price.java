package code.refactoring.methodarrange_2;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}

	public double getPrice() {
		if (getBasePrice() > 1000)  return getBasePrice() * 0.95;
		else return getBasePrice() * 0.98;
	}

	private int getBasePrice() {
		return _quantity * _itemPrice;
	}

}
