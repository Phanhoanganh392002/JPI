package assignment;

import java.nio.file.attribute.FileTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       // Fraction t1 = new Fraction(1,2);
        //Fraction t2 = new Fraction(3,4);
       // Fraction t= t1.add(t2);
       // Fraction tt = t2.add(t1);
       // Fraction ttt = t.add(tt);

       // Scanner sc = new Scanner(System.in);
       // Fraction tx = new Fraction(sc.nextInt(),sc.nextInt());


        Domestic vn=new Domestic(1,"abc","01-01-2022","kinh doanh",150);
        System.out.print(vn.TienDien());

        Foreign nn = new Foreign(4,"asd123","01-01-2022",50,"usa");
        System.out.println(nn.TienDien());
    }
}