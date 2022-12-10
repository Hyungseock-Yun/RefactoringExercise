package code.refactoring.methodarrange_3;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}

	public double price() {
		//������(price) = �ѱ��ž�(base price) - �뷮��������(discount) + ��ۺ�(shipping)

		int basePrice = _quantity * _itemPrice;
		double discount = Math.max(0, _quantity - 500) * _itemPrice * 0.05;
		double shipping = Math.min(_quantity * _itemPrice * 0.1, 1000.0);

		return basePrice - discount +	shipping;
	}

}
