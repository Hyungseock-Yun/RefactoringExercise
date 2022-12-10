package code.tdd.mock;

public class MockMD5Cipher implements MD5Cipher {

	@Override
	public String encrypt(String source) {
		// TODO Auto-generated method stub
		return "8ee2027983915ec78acc45027d874316";
	}

	@Override
	public String decrypt(String source) {
		// TODO Auto-generated method stub
		return "potato";
	}
	
	//  "potato"  ��ȣ����  "8ee2027983915ec78acc45027d874316"


}
