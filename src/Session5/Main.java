package Session5;

public class Main {
    public static void main(String[] args){
        try {
            int a = 10;
            int b = 0;
            if(a > 5){
                throw new Exception("Số to quá không chia được");
            }
            int c = a / b;
            System.out.println("c = " + c);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            // dù có catch hay ko thì vẫn chạy qua đây
        }
    }
}
