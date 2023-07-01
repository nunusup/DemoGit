package Week5;

import java.util.Scanner;

public class QLDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListDS a = new ListDS();
        int chon = 0;
        do{
            System.out.println("=======Menu=======\n"
                    + "1.input Studentn\n"
                    + "2.input Worker\n"
                    + "3.input Officer\n"
                    + "4.Print all Student\n"
                    + "5.Print all Worker\n"
                    + "6.Print all Officer\n"
                    + "0.out");
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    a.nhapStudent();
                    break;
                case 2:
                    a.nhapWorker();
                    break;
                case 3:
                    a.nhapOfficer();
                case 4:
                    a.xuatStudent();
                    break;
                case 5:
                    a.xuatWorker();
                case 6:
                    a.xuatOfficer();
            }
        }while(chon!=0);
    }
}
