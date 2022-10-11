package Session1;

import java.util.Scanner;

public class Main {
    public  static  void main(String[]args){
        Student s ;
        s = new Student();
        s.name = "Nam";
        s.age = 18;

        Student s2 = new Student();
        s2.age =21;

        s.showInfo();
        s2.showInfo();

        Scanner sc = new Scanner(System.in);
        Triangle t = new Triangle();
        System.out.println("Nhap canh 1:");
        t.setCanh1(sc.nextInt());
        System.out.println("Nhap canh 2:");
        t.setCanh2(sc.nextInt());
        System.out.println("Nhap canh 3:");
        t.setCanh3(sc.nextInt());
        System.out.println("ChuVi: "+t.tinhChuVi());
        System.out.println("Dien tich: "+t.tinhDienTich());

    }
}

