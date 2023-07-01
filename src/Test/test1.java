package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    protected String name;
    protected int age;

    protected test1() {
    }

    protected test1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
    }

    protected void xuat(){
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+age);
        System.out.println("====================");
    }

    @Override
    public String toString() {
        return "test1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
