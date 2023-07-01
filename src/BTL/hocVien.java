package BTL;

import java.util.Scanner;

public class hocVien extends Nguoi{
    final long tienHoc1buoi = 250000;
    protected long hocPhi;
    protected double Diem;
    protected String ngayDki;
    protected String hanNop;
    protected String maHV;
    protected long soBuoi;

    public hocVien(String hoTen, String ngaySinh, String diaChi, String SDT, String email, long hocPhi, double diem, String ngayDki, String hanNop, String maHV, int soBuoi) {
        super(hoTen, ngaySinh, diaChi, SDT, email);
        this.hocPhi = hocPhi;
        this.Diem = diem;
        this.ngayDki = ngayDki;
        this.hanNop = hanNop;
        this.maHV = maHV;
        this.soBuoi = soBuoi;
    }

    public hocVien() {
        super();
    }
    public void nhap(){
        super.nhap();

        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ma hoc vien: ");
        maHV= sc.nextLine();
        System.out.print("Nhap ngay dang ki: ");
        ngayDki=sc.nextLine();
        System.out.print("Nhap han nop: ");
        hanNop= sc.nextLine();
        System.out.print("Nhap so buoi tham gia hoc: ");
        soBuoi=sc.nextInt();

        System.out.print("Nhap diem trong qua trinh tham gia hoc: ");
        Diem=sc.nextDouble();
        hocPhi=soBuoi*tienHoc1buoi;
    }
    public void xuat(){
        super.xuat();
        System.out.println("Ma hoc vien: "+maHV);
        System.out.println("Ngay dang ki: "+ngayDki);
        System.out.println("Han nop: "+hanNop);
        System.out.println("Diem dat duoc: "+Diem);
        System.out.println("Hoc phi: "+hocPhi);
        System.out.println("==================================================");
    }

    @Override
    public String toString() {
        return "hocVien{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", SDT='" + SDT + '\'' +
                ", email='" + email + '\'' +
                ", hocPhi=" + hocPhi +
                ", Diem=" + Diem +
                ", ngayDki='" + ngayDki + '\'' +
                ", hanNop='" + hanNop + '\'' +
                ", maHV='" + maHV + '\'' +
                ", soBuoi=" + soBuoi +
                '}';
    }

    public long getTienHoc1buoi() {
        return tienHoc1buoi;
    }

    public long getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(long hocPhi) {
        this.hocPhi = hocPhi;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double diem) {
        Diem = diem;
    }

    public String getNgayDki() {
        return ngayDki;
    }

    public void setNgayDki(String ngayDki) {
        this.ngayDki = ngayDki;
    }

    public String getHanNop() {
        return hanNop;
    }

    public void setHanNop(String hanNop) {
        this.hanNop = hanNop;
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public long getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(long soBuoi) {
        this.soBuoi = soBuoi;
    }
}
