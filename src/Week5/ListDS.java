package Week5;

import java.util.ArrayList;
import java.util.Scanner;

public class ListDS {
    protected ArrayList<Student> st = new ArrayList<Student>();
    protected ArrayList<employee> em = new ArrayList<employee>();
    protected ArrayList<Officer> of = new ArrayList<Officer>();
    public void nhapStudent(){

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("So hoc vien can nhap: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("========Nhap hoc vien thu "+(i+1)+" ========");
            Student a = new Student();
            a.nhap();
            st.add(a);
        }
    }

    public void xuatStudent(){
        for(Student i : st){
            i.xuat();
        }
    }

    public void nhapWorker(){
        Scanner sc = new Scanner(System.in);
        int l;
        System.out.println("So worker can nhap: ");
        l = sc.nextInt();
        for(int j =0; j<l;j++){
            System.out.println("========Nhap worker thu "+(j+1)+"========");
            employee b = new employee();
            b.nhap();
            em.add();
        }
    }

    public void xuatWorker(){
        for(employee j : em){
            j.xuatworker();
        }
    }

    public void nhapOfficer(){
        Scanner sc = new Scanner(System.in);
        int h;
        System.out.println("So Officer can nhap: ");
        h = sc .next();
        for(int f=0;f<h;f++){
            System.out.println("========Nhap Officer thu "+(f+1)+"=========");
            Officer c = new Officer();
            c.nhap();
            of.add();
        }
    }

    public void xuatOfficer(){
        for(Officer f : of){
            f.xuatOfficer();
        }
    }
}
