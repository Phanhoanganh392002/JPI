package Session5;

public class Main {
    public static void main(String[] args){

        try{
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println("c = "+c);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic errors");
        }catch (Exception e){
            System.out.println("Errors");
        }
    }
}
