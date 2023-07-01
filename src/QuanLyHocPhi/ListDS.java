package QuanLyHocPhi;


public class ListDS {
    Nguoi n[] = new Nguoi[100];
    private int Count, Count1;
    public ListDS(){
        Count = 0;
        Count1 = 0;
        for(int i=0;i<100;i++){
            n[i] = new Nguoi();
        }
    }
    public void themDS(int temp){
        if(Count >100 || Count1 >100){
            System.out.println("Bo nho full, khong the them moi");
        }else {
            if(temp == 1){
                n[Count] = new HocVien();
                HocVien hv = new HocVien();
                hv.nhap();
            }else {
                n[Count1] = new NhanVien();
                NhanVien nv = new NhanVien();
                nv.nhap();
            }
            Count++;
            Count1++;
        }
    }
    public void hienDS(int temp){
        if(temp == 3){
            for(int i=0;i<Count;i++){
                System.out.println("----So tt: " + (i+1));
                System.out.println(n[i].toString());
            }
        }else if(temp == 4){
            for(int j=0;j<Count1;j++){
                System.out.println("----so tt: " + (j+1));
                System.out.println(n[j].toString());
            }
        }
    }
}
