package Session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s;
        s = new Student();
        s.name = "Nam";
        s.age = 18;

        Student s2 = new Student();
        s2.age = 21;

        s.showInfo();
        s2.showInfo();

      Scanner sc = new Scanner(System.in);
      // Triangle t = new Triangle();
     // System.out.println("Nhap canh 1:");
      //t.setCanh1(sc.nextInt());
      //System.out.println("Nhap canh 2:");
      //t.setCanh2(sc.nextInt());
       //System.out.println("Nhap canh 3:");
      // t.setCanh3(sc.nextInt());
      //System.out.println("ChuVi: "+t.tinhChuVi());
     // System.out.println("Dien tich: "+t.tinhDienTich());

        //khoi tao phan so
        PhanSo ps1 = new PhanSo();
        System.out.println("Nhap tu so cho phan so 1:");
        ps1.setTuSo(sc.nextInt());
        System.out.println("Nhap mau so cho phan so 1:");
        ps1.setMauSo(sc.nextInt());
        PhanSo ps2 = new PhanSo();
        System.out.println("Nhap tu so cho phan so 2:");
        ps2.setTuSo(sc.nextInt());
        System.out.println("Nhap mau so cho phan so 2:");
        ps2.setMauSo(sc.nextInt());
        PhanSo psTong;
        PhanSo psHieu;
        PhanSo psTich;
        PhanSo psThuong;


       //Phuong thuc
        //In phan so
        System.out.println("Phan so 1 vua nhap la:");
        ps1.hienthi();
        System.out.println("Phan so 2 vua nhap la:");
        ps2.hienthi();
        //Tong
        psTong = ps1.add(ps2);
        System.out.println("Phan so tong la:");
        psTong.hienthi();
        //Hieu
        psHieu = ps1.sub(ps2);
        System.out.println("Phan so hieu la:");
        psHieu.hienthi();
        //Tich
        psTich = ps1.mul(ps2);
        System.out.println("Phan so tich la:");
        psTich.hienthi();
        //Thuong
        psThuong = ps1.div(ps2);
        System.out.println("Phan so thuong la:");
        psThuong.hienthi();
    }

}

