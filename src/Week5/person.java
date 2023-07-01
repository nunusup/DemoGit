package Week5;

import java.util.Scanner;

public class person {
    protected String name;
    protected int yearOfbirth;
    protected long phoneNumber;
    protected String Address;
    protected int age;

    public person(String name, int yearOfbirth, long phoneNumber, String address) {
        this.name = name;
        this.yearOfbirth = yearOfbirth;
        this.phoneNumber = phoneNumber;
        Address = address;
    }

    public person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfbirth() {
        return yearOfbirth;
    }

    public void setYearOfbirth(int yearOfbirth) {
        this.yearOfbirth = yearOfbirth;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void nhap(){
        age = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Your name: ");
        name = sc.nextLine();
        System.out.println("Year of your birth: ");
        yearOfbirth = sc.nextInt();
        age = 2021 - yearOfbirth;
        System.out.println("Your phone number: ");
        phoneNumber = sc.nextLong();
        System.out.println("Address: ");
        Address = sc.nextLine();
    }


    public void xuat(){
        System.out.println("----hiends");
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("phone number: "+phoneNumber);
        System.out.println("address: "+Address);
        System.out.println("----------------");
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", yearOfbirth=" + yearOfbirth +
                ", phoneNumber=" + phoneNumber +
                ", Address='" + Address + '\'' +
                ", age=" + age +
                '}';
    }
}
