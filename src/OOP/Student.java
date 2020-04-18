package OOP;

public class Student {
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

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
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
