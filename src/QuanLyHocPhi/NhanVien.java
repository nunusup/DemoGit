package QuanLyHocPhi;

import java.util.Scanner;

public class NhanVien extends Nguoi{
    private String manv;
    private int chucvu;
    private double Luong;
    private double hesoluong;

    public NhanVien() {
        super();
        this.manv = "";
        this.chucvu = 0;
        Luong = 0;
        this.hesoluong = 0;
    }

    public NhanVien(String hoten, String ngaysinh, String diachi, String sdt, String email, String manv, int chucvu, double luong, double hesoluong) {
        super(hoten, ngaysinh, diachi, sdt, email);
        this.manv = manv;
        this.chucvu = chucvu;
        Luong = luong;
        this.hesoluong = hesoluong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public int getChucvu() {
        return chucvu;
    }

    public void setChucvu(int chucvu) {
        this.chucvu = chucvu;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double luong) {
        Luong = luong;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Ma nhan vien: ");
        manv = sc.nextLine();
        System.out.println("Chuc vu (thu ngan = 1/quan ly = 2): ");
        chucvu = sc.nextInt();
    }

    @Override
    public String toString() {
        return "NhanVien{" + super.toString() +
                "manv='" + manv + '\'' +
                ", chucvu=" + chucvu +
                ", Luong=" + Luong +
                ", hesoluong=" + hesoluong +
                '}';
    }
}
