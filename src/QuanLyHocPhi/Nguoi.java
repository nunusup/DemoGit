package QuanLyHocPhi;

import java.util.Scanner;

public class Nguoi {
    protected String hoten;
    protected String ngaysinh;
    protected String diachi;
    protected String sdt;
    protected String Email;

    protected Nguoi() {
        this.hoten = "";
        this.ngaysinh = "";
        this.diachi = "";
        this.sdt = "";
        Email = "";
    }

    protected Nguoi(String hoten, String ngaysinh, String diachi, String sdt, String email) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
        Email = email;
    }

    protected String getHoten() {
        return hoten;
    }

    protected void setHoten(String hoten) {
        this.hoten = hoten;
    }

    protected String getNgaysinh() {
        return ngaysinh;
    }

    protected void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    protected String getDiachi() {
        return diachi;
    }

    protected void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    protected String getSdt() {
        return sdt;
    }

    protected void setSdt(String sdt) {
        this.sdt = sdt;
    }

    protected String getEmail() {
        return Email;
    }

    protected void setEmail(String email) {
        Email = email;
    }

    protected void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Ngay sinh: ");
        ngaysinh = sc.nextLine();
        System.out.println("So dien thoai lien lac: ");
        sdt = sc.nextLine();
        System.out.println("Dia chi: ");
        diachi = sc.nextLine();
        System.out.println("Email: ");
        Email = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoten='" + hoten + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", diachi='" + diachi + '\'' +
                ", sdt='" + sdt + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
