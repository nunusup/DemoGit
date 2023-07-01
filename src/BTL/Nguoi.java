package BTL;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String diaChi;
    protected String SDT;
    protected String email;

    public Nguoi(String hoTen, String ngaySinh, String diaChi, String SDT, String email) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.email = email;
    }

    public Nguoi() {
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Xin vui long nhap ho ten: ");
        hoTen= sc.nextLine();;
        System.out.print("Xin vui long nhap ngay sinh: ");
        ngaySinh= sc.nextLine();
        System.out.print("Xin vui long nhap dia chi: ");
        diaChi=sc.nextLine();
        System.out.print("Xin vui long nhap so dien thoai: ");
        SDT = sc.nextLine();
        System.out.print("Xin vui long nhap email: ");
        email=sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Ngay sinh: "+ngaySinh);
        System.out.println("Dia chi: "+ diaChi);
        System.out.println("SDT: "+SDT);
        System.out.println("Email: "+email);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", SDT='" + SDT + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
