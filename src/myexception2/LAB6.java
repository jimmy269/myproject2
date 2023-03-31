package myexception2;

public class LAB6 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }
        catch (ArithmeticException e) {
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            StackTraceElement[] st = e.getStackTrace();
            System.out.println(st[0].getClass());
            System.out.println(st[0].getMethodName());
            System.out.println(st[0].getFileName());
            System.out.println(st[0].getLineNumber());
        }
    }
}
