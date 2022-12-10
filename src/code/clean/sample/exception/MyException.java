package code.clean.sample.exception;

public class MyException extends Exception {
    
    public MyException() {
        super("음수는 입력될 수 없습니다.");
    }

}
