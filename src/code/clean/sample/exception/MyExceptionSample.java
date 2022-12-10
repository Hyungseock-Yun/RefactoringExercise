package code.clean.sample.exception;

import java.util.Scanner;

public class MyExceptionSample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        
        try {
            int num = sc.nextInt();
            System.out.println(inputnum(num));
            
        } catch (MyException e) {
            System.out.println(e);
        }
    }

    private static int inputnum(int num) throws MyException {
        int workNum = num;
        
        if(workNum < 0) {
            throw new MyException();	            //MyException
        }
       
        return workNum;
    }

}
