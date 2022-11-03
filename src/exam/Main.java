package exam;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Complex sp1 = new Complex();
        System.out.println("Nhap so thuc 1:");
        sp1.setRe(sc.nextInt());
        System.out.println("Nhap so ao 1:");
        sp1.setIm(sc.nextInt());
        Complex sp2 = new Complex();
        System.out.println("Nhap so thuc 2:");
        sp2.setRe(sc.nextInt());
        System.out.println("Nhap so ao 2:");
        sp2.setIm(sc.nextInt());

        Complex spAdd ;
        spAdd = Complex.add(sp1,sp2);
        System.out.println(spAdd);

        Complex spSubtract ;
        spSubtract = Complex.subtract(sp1,sp2);
        System.out.println(spSubtract);

        Complex spMultiply ;
        spMultiply = Complex.multiply(sp1,sp2);
        System.out.println(spMultiply);

        Complex spDivide ;
        spDivide = Complex.divide(sp1,sp2);
        System.out.println(spDivide);
    }
}
