package QuanLyHocPhi;

import java.util.Scanner;

public class QLDS {
    public static void main(String[] args) {
        ListDS lds = new ListDS();
        Scanner in = new Scanner(System.in);
        int x;
        do{
            System.out.println("0. Thoat ung dung");
            System.out.println("1. Nhap danh sach hoc vien");
            System.out.println("2. Nhap danh sach nhan vien");
            System.out.println("3. Hien thi danh sach hoc vien");
            System.out.println("4. Hien thi danh nhan vien");
            x = in.nextInt();
            switch (x){
                case 1:
                    lds.themDS(1);
                    break;
                case 2:
                    lds.themDS(2);
                    break;
                case 3:
                    lds.hienDS(3);
                    break;
                case 4:
                    lds.hienDS(4);
                    break;
            }
        }while(x!=0);
            System.out.println("");
    }
}
