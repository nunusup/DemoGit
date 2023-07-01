package BTL;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, ParseException {
        Scanner sc = new Scanner(System.in);
        tinhNangchohocVien a = new tinhNangchohocVien();
        int chon = 0;
        do {
            System.out.println("==========MENU==========\n"
                    + "1. Nhap danh sach\n"
                    + "2. Hien danh sach\n"
                    + "3. Them Hoc Vien moi\n"
                    + "4. Xoa Hoc Vien trong danh sach\n"
                    + "5. Sua thong tin Hoc vien\n"
                    + "6. Sap xep nhan vien theo ho ten\n"
                    + "7. Sap xep so tien thu duoc cua hoc vien\n"
                    + "8. Kiem tra Hoc Vien dat hoc bong\n"
                    + "9. Tinh tien chi cho hoc bong\n"
                    + "10. Tinh tien hoc phi thu duoc\n"
                    + "11. Kiem tra Hoc Vien hoc lai (truot mon)\n"
                    + "12. Kiem tra nhan vien Thu Ngan\n"
                    + "13. Kiem tra Hoc Vien qua han nop hoc phi\n"
                    + "14. Kiem tra hoc vien da nop hoc phi\n"
                    + "15. Ghi File\n"
                    + "16. Doc File\n"
                    + "0. Thoat chuong trinh");
            chon = sc.nextInt();
            switch (chon) {

                case 1:
                    a.nhapHocvien();
                    break;
                case 2:
                    a.xuatHocvien();
                    break;
                case 3:
                    a.chenpt();
                    break;
                case 4:
                    a.xoapt();
                    break;
                case 5:
                    a.suaThongtin();
                    break;
                case 6:
                    a.sapXeptheoTen();
                    break;
                case 7:
                    a.sapXeptheoTien();
                    break;
                case 8:
                    a.hocBong();
                    break;
                case 9:
                    a.tinhtienHB();
                    break;
                case 10:
                    a.tinhtienThu();
                    break;
                case 11:
                    a.hocLai();
                    break;
                case 12:
                    a.traNguoithu();
                    break;
                case 13:
                    a.traNguoiquahan();
                    break;
                case 14:
                    a.traNguoidaNop();
                    break;
                case 15:
                    a.luuFile();
                    break;
                case 16:
                    a.docFile();
                    break;
                default:
                    System.out.println("Cam on da su dung chuong trinh !");
            }
        } while (chon != 0);
    }
}
