package myexception2;

public class LAB3 {
    public static void main(String[] args) {
        try{
            System.out.println("stm 1");
            System.out.println("stm 2");
            System.out.println("stm 3");
        }
        catch (Exception e){
        }
        finally{
            System.out.println("stm 4");
        }
        System.out.println("stm 5");
    }
}
