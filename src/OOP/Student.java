package OOP;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private String ten;
    private float diem;
    private int tuoi;
    private String mssv;
    private String chuyenNganh;
    private String diaChi;

    public Student() {
    }

    public Student(String ten, float diem, int tuoi, String mssv, String chuyenNganh, String diaChi) {
        this.ten = ten;
        this.diem = diem;
        this.tuoi = tuoi;
        this.mssv = mssv;
        this.chuyenNganh = chuyenNganh;
        this.diaChi = diaChi;
    }
    public void nhapSV(){
        System.out.print("Tên : ");
        this.ten = sc.nextLine();
        System.out.print("Tuổi : ");
        this.tuoi = Integer.valueOf(sc.nextLine());
        System.out.print("Địa chỉ : ");
        this.diaChi = sc.nextLine();
        System.out.print("Chuyên Ngành : ");
        this.chuyenNganh = sc.nextLine();
        System.out.print("Mssv : ");
        this.mssv = sc.nextLine();
        System.out.print("Điểm : ");
        this.diem = Float.valueOf(sc.nextLine());
    }
    public String toString(){
        return "Họ và tên: "+this.ten+"Tuổi: "+this.tuoi+"Địa Chỉ: "+this.diaChi+"Chuyên Ngành: "+this.chuyenNganh
                +"Mssv: "+this.mssv+"Điểm: "+this.diem;
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten==null || ten.isEmpty() ){
            System.out.println("Hãy nhập tên");
        }
        else this.ten = ten;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        if (diem>=0 && diem<=10){
            this.diem = diem;
        }
        else System.out.println("Điểm không hợp lệ");
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi>18){
            this.tuoi = tuoi;
        }
        else System.out.println("Tuổi không hợp lệ");
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
