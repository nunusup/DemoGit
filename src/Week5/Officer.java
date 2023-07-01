package Week5;

import java.util.Scanner;

public class Officer extends person{
    protected String companyName;
    protected String rollNumber;
    protected int yearOfexperience;
    protected int level;
    protected int salary1;
    protected int salary2;
    protected static int basesalary;

    public Officer() {
        super(name, yearOfbirth, phoneNumber, address);
        this.companyName = companyName;
        this.rollNumber = rollNumber;
        this.yearOfexperience = yearOfexperience;
        this.level = level;
        this.salary1 = salary1;
        this.salary2 = salary2;
    }

    public void employee() {
        super();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getYearOfexperience() {
        return yearOfexperience;
    }

    public void setYearOfexperience(int yearOfexperience) {
        this.yearOfexperience = yearOfexperience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void nhap(){
        super.nhap();

        Scanner sc = new Scanner(System.in);
        System.out.println("Company name: ");
        companyName = sc.nextLine();
        System.out.println("Rollnumber: ");
        rollNumber = sc.nextLine();
        System.out.println("Year of experience: ");
        yearOfexperience = sc.nextInt();
        System.out.println("Level: ");
        level = sc.nextInt();
    }

    public void xuatOfficer(){
        super.xuat();

        System.out.println("company name: "+companyName);
        System.out.println("rollnumber: O"+rollNumber);
        System.out.println("year of experience: "+ yearOfexperience);
        System.out.println("level: "+level);
    }

    @Override
    public String toString() {
        return "employee{" +super.toString()+
                "companyName='" + companyName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", yearOfexperience=" + yearOfexperience +
                ", level=" + level +
                ", salary1=" + salary1 +
                ", salary2=" + salary2 +
                '}';
    }
}
