package BTL;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class tinhNangchohocVien {
    protected ArrayList<thuNgan> tn;

    public tinhNangchohocVien() {
        tn = new ArrayList<thuNgan>(); // Khoi tao danh sach
    }

    public void nhapHocvien() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so hoc vien can nhap: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("============= Nhap hoc vien thu " + (i + 1) + " ===============");
            thuNgan a = new thuNgan();
            a.nhap();
            tn.add(a);
        }
    }

    public void xuatHocvien() {
        for (thuNgan i : tn) {
            i.xuat();
        }
    }

    public void hocBong() {
        Scanner sc = new Scanner(System.in);
        for (thuNgan i : tn) {
            if (i.getDiem() > 7.0 && i.getDiem() < 10.0) {
                System.out.println("==========  Hoc vien nhan hoc bong la hoc vien so " + (tn.indexOf(i) + 1) + " ===========");
                thuNgan a = new thuNgan();
                a = tn.get(tn.indexOf(i));
                a.xuat();
                System.out.println("==========  Hoc vien nhan hoc bong duoc giam " + (i.getHocPhi() * 0.25) + " ===========");
                System.out.println("==========  Hoc vien nhan hoc bong la hoc vien so " + (tn.indexOf(i) + 1) + " phai dong: " + (i.getHocPhi() - i.getHocPhi() * 0.25));
            } else {
                System.out.println("========== Hoc vien so " + (tn.indexOf(i) + 1) + " khong nhan duoc hoc bong =========");
            }
        }
    }

    public void chenpt() {
        thuNgan a = new thuNgan();
        int index;
        System.out.println("Nhap vi tri hoc vien can nhap: ");
        Scanner sc = new Scanner(System.in);
        index = sc.nextInt();
        System.out.println("++++++++++Nhap hoc vien moi+++++++++++");
        a.nhap();
        try {
            tn.add(index, a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void xoapt() {
        int index;
        System.out.println("Nhap vi tri hoc vien can xoa: ");
        Scanner sc = new Scanner(System.in);
        index = sc.nextInt();
        System.out.println("+++++++++++Hoc vien da duoc xoa++++++++++");
        try {
            tn.remove(index);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void tinhtienHB() {
        int sum = 0;
        for (thuNgan i : tn) {
            if (i.getDiem() > 7.0 && i.getDiem() < 10.0)
                sum += i.getHocPhi() * 0.25;
        }
        System.out.println("========== So tien phai chi cho hoc bong " + (sum) + " ===========");
    }

    public void tinhtienThu() {
        int sum = 0;
        for (thuNgan i : tn) {
            sum += (i.soTienthu);
        }
        System.out.println("========== So tien thu duoc la " + (sum) + " ===========");
    }

    public void hocLai() {
        Scanner sc = new Scanner(System.in);
        for (thuNgan i : tn) {
            if (i.getDiem() > 0 && i.getDiem() < 3) {
                System.out.println("==========  Hoc vien so " + (tn.indexOf(i) + 1) + " chua qua mon  ===========");
                System.out.println("==========  Hoc vien so " + (tn.indexOf(i) + 1) + " phai dong: " + (i.getHocPhi() * 0.7) + " de hoc lai==========");
            } else {
                System.out.println("========== Hoc vien so " + (tn.indexOf(i) + 1) + " da qua mon =========");
            }
        }
    }

    public void traNguoithu() {
        int sum = 0;
        int money = 0;
        String nguoicantim;
        ArrayList<String> thu = new ArrayList<String>();
        ArrayList<Integer> viTri = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten nguoi da thu: ");
        nguoicantim = sc.nextLine();
        for (thuNgan i : tn) {
            if (i.tenThungan.compareToIgnoreCase(nguoicantim) == 0) {
                viTri.add(tn.indexOf(i));
                thu.add(i.hoTen);
                sum++;
                money += i.soTienthu;
            }
        }
        if (sum != 0) {
            System.out.println("Nguoi nay da thu " + sum + " hoc vien.");
            System.out.println("Nguoi nay da thu tong so tien la " + money + ".");
            System.out.println("Nguoi nay da thu cua hoc vien so: ");
            for (int i = 0; i < viTri.size(); i++) {
                int n = viTri.get(i);
                System.out.println(n + 1 + "   ");
            }
            System.out.println("Nguoi nay da thu cua hoc vien co ten: ");
            for (int i = 0; i < thu.size(); i++) {
                String s = thu.get(i);
                System.out.println(s);
            }
        } else {
            System.out.println("Khong co nguoi nao ten nhu tren: ");
        }
    }

    public void traNguoiquahan() throws ParseException {
        ArrayList<String> thu = new ArrayList<String>();
        ArrayList<Integer> viTri = new ArrayList<Integer>();
        int sum=0;
        for (thuNgan i : tn) {
            String ngaythu1=i.getNgayThu();
            String hannop=i.getHanNop();
            Date ngayThu = new SimpleDateFormat("dd/MM/yyyy").parse(ngaythu1);
            Date hanNop = new SimpleDateFormat("dd/MM/yyyy").parse(hannop);
            if(ngayThu.compareTo(hanNop)>0){
                sum++;
                viTri.add(tn.indexOf(i));
                thu.add(i.hoTen);
            }
        }
        if (sum != 0) {
            System.out.println("Co " + sum + " hoc vien nop tien muon.");
            System.out.println("Cac hoc vien nop tien muon la hoc vien so: ");
            for (int i = 0; i < viTri.size(); i++) {
                int n = viTri.get(i);
                System.out.println(n + 1 + "   ");
            }
            System.out.println("Ten cua cac hoc vien nop muon: ");
            for (int i = 0; i < thu.size(); i++) {
                String s = thu.get(i);
                System.out.println(s);
            }
        }
    }
    public void suaThongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vi tri hoc vien can sua thong tin: ");
        int n = sc.nextInt();
        if (n < tn.size()) {
            thuNgan a = new thuNgan();
            a.nhap();
            tn.set(n, a);
        }
        else{
            System.out.println("Vi tri nay khong co hoc vien nao ");
        }
        System.out.println("Thong tin sau khi duoc sua: ");
    }
    public void sapXeptheoTen(){
        System.out.println("Sap xep theo ten: ");
        Collections.sort(tn, sapXep.TEN);
    }
    public void sapXeptheoTien(){
        System.out.println("Sap xep theo tien: ");
        Collections.sort(tn, sapXep.TIEN);
    }
    public void traNguoidaNop() throws ParseException {
        ArrayList<String> nop = new ArrayList<String>();
        ArrayList<Integer> viTri = new ArrayList<Integer>();
        int sum=0;
        for (thuNgan i : tn) {
            if(i.soTienthu==i.hocPhi){
                sum++;
                viTri.add(tn.indexOf(i));
                nop.add(i.hoTen);
            }
        }
        if (sum != 0) {
            System.out.println("Co " + sum + " hoc vien da nop du.");
            System.out.println("Cac hoc vien da nop tien du la cac hoc vien so: ");
            for (int i = 0; i < viTri.size(); i++) {
                int n = viTri.get(i);
                System.out.println(n + 1 + "  ");
            }
            System.out.println("Ten cua cac hoc vien da nop du tien: ");
            for (int i = 0; i < nop.size(); i++) {
                String s = nop.get(i);
                System.out.println(s);
            }
        }else {
            System.out.println("Khong co hoc vien nao nop du tien.");
        }
    }
    public void luuFile() throws FileNotFoundException, IOException {
        File f = new File("data.dat");

        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream objout = new ObjectOutputStream(fout);

        objout.writeObject(tn);

        objout.close();
        fout.close();
    }



    public void docFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        File f = new File("data.dat");

        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);

        ArrayList<thuNgan> tn2;
        tn2 = (ArrayList) objin.readObject();
        System.out.println(tn2.toString());
        objin.close();
        fin.close();

    }
}
