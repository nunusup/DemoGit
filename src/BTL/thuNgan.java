package BTL;

import java.io.Serializable;
import java.util.ArrayList;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class thuNgan extends hocVien implements Serializable{
    protected String tenThungan;
    protected long soTienthu;
    protected String ngayThu;

    public thuNgan(String hoTen, String ngaySinh, String diaChi, String SDT, String email, long hocPhi, double diem, String ngayDki, String hanNop, String maHV, int soBuoi, String tenThungan, long soTienthu, String ngayThu) {
        super(hoTen, ngaySinh, diaChi, SDT, email, hocPhi, diem, ngayDki, hanNop, maHV, soBuoi);
        this.tenThungan = tenThungan;
        this.soTienthu = soTienthu;
        this.ngayThu = ngayThu;
    }

    public thuNgan() {
        super();
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap ten nguoi thu ngan: ");
        tenThungan=sc.nextLine();
        System.out.print("Nhap ngay thu: ");
        ngayThu=sc.nextLine();
        System.out.print("Nhap so tien thu: ");
        soTienthu=sc.nextLong();
        System.out.println("==================================================");
    }

    public String getTenThungan() {
        return tenThungan;
    }

    public void setTenThungan(String tenThungan) {
        this.tenThungan = tenThungan;
    }

    public long getSoTienthu() {
        return soTienthu;
    }

    public void setSoTienthu(long soTienthu) {
        this.soTienthu = soTienthu;
    }

    public String getNgayThu() {
        return ngayThu;
    }

    public void setNgayThu(String ngayThu) {
        this.ngayThu = ngayThu;
    }

    @Override
    public String toString() {
        return "thuNgan{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", SDT='" + SDT + '\'' +
                ", email='" + email + '\'' +
                ", tienHoc1buoi=" + tienHoc1buoi +
                ", hocPhi=" + hocPhi +
                ", Diem=" + Diem +
                ", ngayDki='" + ngayDki + '\'' +
                ", hanNop='" + hanNop + '\'' +
                ", maHV='" + maHV + '\'' +
                ", soBuoi=" + soBuoi +
                ", tenThungan='" + tenThungan + '\'' +
                ", soTienthu=" + soTienthu +
                ", ngayThu='" + ngayThu + '\'' +
                '}';
    }
}
