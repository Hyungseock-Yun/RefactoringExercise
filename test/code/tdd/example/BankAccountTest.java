package code.tdd.example;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import code.tdd.example.BankAccount;


public class BankAccountTest {
	
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetBalance() throws Exception {
		BankAccount bankAccount = new BankAccount(10000);		// 10000원으로 계좌 생성
		// 잔고 조회결과 일치여부 확인
		assertTrue("10000원 계좌생성 후 잔고조회", bankAccount.getBalance() == 10000);

	}
	
	@Test
	public void testDeposit() throws Exception {
		// 10000 ������ ���»���
		// 1000�� �Ա�
		// �ܰ���ȸ��� 11000 ��ġ���� Ȯ��
		
	}
	@Test
	public void testWithdraw() throws Exception {
		// 10000 ������ ���»���
		// 1000�� ���
		// �ܰ���ȸ��� 9000 ��ġ���� Ȯ��
	} 

}
 