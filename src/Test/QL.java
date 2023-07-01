package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QL {
    protected ArrayList<test1> t;

    public QL() {
        t = new ArrayList<test1>();
    }

    public void nhaphoten(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap bn nguoi: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("-----nhap nguoi thu "+i+1+": ");
            test1 tc = new test1();
            tc.nhap();
            t.add(tc);
        }
    }

    public void hiends(){
        System.out.println("Danh sach nhap------");
        for(test1 i : t){
            i.xuat();
        }
    }

    public void Xoapt(){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Muon xoa phan tu nao: ");
        x = sc.nextInt();
        System.out.println("Da xoa phan tu");
        try{
            t.remove(x);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        hiends();
    }

    public void sapXeptheoTen(){
        System.out.println("Sap xep theo ten------");
        Collections.sort(t,sapXep.ten);
        hiends();
    }
}
