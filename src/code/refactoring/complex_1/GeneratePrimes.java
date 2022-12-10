package code.refactoring.complex_1;

/**
 * �� Ŭ������ ����ڰ� ������ �ִ� ������ �Ҽ��� �����Ѵ�. ���� �˰����� ��������׽��� ü��.
 * <P>
 * �������׳׽� : ����� 276�⿡ ����� Ű���׿��� ���, ����� 194�� ���
 * ���� �ѷ��� ���ʷ� ����� ������� �޷¿� ������ ������ ���
 * �˷���帮�� ���������� ����
 * <P>
 * �˰����� ����� �ܼ��ϴ�. 2���� �����ϴ� ���� �迭�� �������
 * 2�� ����� ��� �����Ѵ�. ������ ���� ������ ã�� �� ������ ����� ��� �����.
 * �ִ� ���� �������� �� ������ �̸� �ݺ��Ѵ�.
 * 
 * @author Bob
 * @version 2012.02.13
 *
 */
public class GeneratePrimes {

	private boolean[] crossedOut;
	private int[] primes;

	private boolean[] initiateArray(int maxValue) {
		// �迭�� ������ �ʰ�ȸ initiateArray()
		for (int i = 0; i < crossedOut.length; i++) {
			crossedOut[i] = true;
		}

		crossedOut[0] = crossedOut[1]= false;

		return crossedOut;
	}

	private void checkPrimes() {
		for(int i=2; i<Math.sqrt(crossedOut.length)+1; i++) {
			if(crossedOut[i]) {	// i�� �����ִ� ���ڶ�� �� ������ ����� ���Ѵ�.
				for (int j=2*i; j<crossedOut.length; j+=i) {
					crossedOut[j] = false; // ����� �Ҽ��� �ƴϴ�.
				}
			}
		}
	}

	private int[] putPrimesResult() {
		int primesCount=0;
		for (int i=0; i<crossedOut.length; i++) {
			if (crossedOut[i]) {
				primesCount++; //ī��Ʈ ����
			}
		}

		primes = new int[primesCount];

		//�Ҽ��� ��� �迭�� �̵��Ѵ�.
		for(int i=0,j=0; i<crossedOut.length; i++) {
			if (crossedOut[i])	// �Ҽ��ϰ�쿡
				primes[j++] = i;
		}

		return  primes;
	}

	public int getPrimes(int maxValue) {
		if (maxValue >= 2) { //�����ϰ� ��ȿ�� ���
			// ����
		crossedOut = initiateArray(maxValue);
			// �Ҽ��� �ƴ� �˷��� ���ڸ� ����
		 checkPrimes();
		 putPrimesResult();
			
			//�ҽ� ������? putPrimesResult()
			System.out.println("primes ���� " + primes.length + "�� �Դϴ�.");
		}
		else	// maxValue < 2
		    System.out.println("primes ���� 0 �� �Դϴ�.");
		
		return primes.length;
	}

}
