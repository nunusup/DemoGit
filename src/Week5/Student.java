package Week5;

import java.util.Scanner;

public class Student extends person{
    protected String schoolName;
    protected double gpa;

    public Student(String name, int yearOfbirth, long phoneNumber, String address, String schoolName, double gpa) {
        super(name, yearOfbirth, phoneNumber, address);
        this.schoolName = schoolName;
        this.gpa = gpa;
    }

    public Student() {
        super();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void nhap(){
        super.nhap();

        Scanner sc= new Scanner(System.in);
        System.out.println("School name: ");
        schoolName = sc.nextLine();
        System.out.println("GPA: ");
        gpa = sc.nextDouble();
    }

    public void xuat(){
        System.out.println("Person");
        super.xuat();
        String tg;
        if(gpa == 4.0){
            tg = "A+"
        }if(gpa == 3.7){
            tg = "A-"
        }if(gpa == 3.3){
            tg = "B+"
        }if(gpa == 3.0){
            tg = "B"
        }if(gpa == 2.7){
            tg = "B-"
        }if(gpa ==2.3){
            tg = "C+"
        }if(gpa ==2.0){
            tg = "C"
        }if(gpa ==1.7){
            tg = "C-"
        }if(gpa ==1.3){
            tg = "D+"
        }if(gpa ==1.0){
            tg = "D"
        }if(gpa ==0.7){
            tg = "D-"
        }if(gpa ==0.0){
            tg = "F"
        }
        System.out.println("school name: "+schoolName);
        System.out.println("GPA: "+tg);
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "schoolName='" + schoolName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
