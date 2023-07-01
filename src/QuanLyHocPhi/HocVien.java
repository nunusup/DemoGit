package QuanLyHocPhi;

import java.util.Scanner;

public class HocVien extends Nguoi{
    private String mahv;
    private String khoahoc;
    private String ngaydangky;
    private double hocphi;
    private String hannop;
    private double sotiendanop;
    private String luchoc;
    private int sobuoi;

    public HocVien() {
        super();
        this.mahv = "";
        this.khoahoc = "";
        this.ngaydangky = "";
        this.hocphi = 0;
        this.hannop = "";
        this.sotiendanop = 0;
        this.luchoc = "";
        this.sobuoi = 0;
    }

    public HocVien(String hoten, String ngaysinh, String diachi, String sdt, String email, String mahv, String khoahoc, String ngaydangky, double hocphi, String hannop, double sotiendanop, String luchoc, int sobuoi) {
        super(hoten, ngaysinh, diachi, sdt, email);
        this.mahv = mahv;
        this.khoahoc = khoahoc;
        this.ngaydangky = ngaydangky;
        this.hocphi = hocphi;
        this.hannop = hannop;
        this.sotiendanop = sotiendanop;
        this.luchoc = luchoc;
        this.sobuoi = sobuoi;
    }

    public String getMahv() {
        return mahv;
    }

    public void setMahv(String mahv) {
        this.mahv = mahv;
    }

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }

    public String getNgaydangky() {
        return ngaydangky;
    }

    public void setNgaydangky(String ngaydangky) {
        this.ngaydangky = ngaydangky;
    }

    public double getHocphi() {
        return hocphi;
    }

    public void setHocphi(double hocphi) {
        this.hocphi = hocphi;
    }

    public String getHannop() {
        return hannop;
    }

    public void setHannop(String hannop) {
        this.hannop = hannop;
    }

    public double getSotiendanop() {
        return sotiendanop;
    }

    public void setSotiendanop(double sotiendanop) {
        this.sotiendanop = sotiendanop;
    }

    public String getLuchoc() {
        return luchoc;
    }

    public void setLuchoc(String luchoc) {
        this.luchoc = luchoc;
    }

    public int getSobuoi() {
        return sobuoi;
    }

    public void setSobuoi(int sobuoi) {
        this.sobuoi = sobuoi;
    }

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("ma hoc vien: ");
        mahv = sc.nextLine();
        System.out.println("Khoa hoc: ");
        khoahoc = sc.nextLine();
        System.out.println("So buoi hoc: ");
        sobuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Ngay dang ky: ");
        ngaydangky = sc.nextLine();
        System.out.println("Hoc phi khoa hoc: ");
        hocphi = Double.parseDouble(sc.nextLine());
        System.out.println("Han nop hoc phi: ");
        hannop = sc.nextLine();
        System.out.println("So tien da nop: ");
        sotiendanop = Double.parseDouble(sc.nextLine());
        System.out.println("Hoc luc cua hoc vien: ");
        luchoc = sc.nextLine();
    }

    @Override
    public String toString() {
        return "HocVien{" + super.toString() +
                "mahv='" + mahv + '\'' +
                ", khoahoc='" + khoahoc + '\'' +
                ", ngaydangky='" + ngaydangky + '\'' +
                ", hocphi=" + hocphi +
                ", hannop='" + hannop + '\'' +
                ", sotiendanop=" + sotiendanop +
                ", luchoc='" + luchoc + '\'' +
                ", sobuoi=" + sobuoi +
                '}';
    }
}
