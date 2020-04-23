package OOP.QuanLyBaiBao;

import java.util.Scanner;

public class BaiBao {
    private String tieuDe;
    private String noiDung;
    private String tacGia;
    private int thoiGianUpBai;
    private String hinhAnh;
    private String hashTag;
    Scanner sc = new Scanner(System.in);

    public BaiBao() {
    }

    public BaiBao(String tieuDe, String noiDung, String tacGia, int thoiGianUpBai, String hinhAnh, String hashTag, Scanner sc) {
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
        this.tacGia = tacGia;
        this.thoiGianUpBai = thoiGianUpBai;
        this.hinhAnh = hinhAnh;
        this.hashTag = hashTag;
        this.sc = sc;
    }

    public void nhapBao() {
            System.out.print("Nhập tiêu đề : ");
            tieuDe = sc.nextLine();
            System.out.print("Nhập nội dung : ");
            noiDung = sc.nextLine();
            System.out.print("Nhập ngày,giờ viết : ");
            thoiGianUpBai = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập tác giả : ");
            tacGia = sc.nextLine();
            System.out.print("Up file ảnh : ");
            hinhAnh = sc.nextLine();
            System.out.println("Nhập HashTag");
            hashTag = sc.nextLine();
    }

    @Override
    public String toString() {
        return "BaiBao{" +
                "tieuDe='" + tieuDe + '\'' +
                ", noiDung='" + noiDung + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", thoiGianUpBai=" + thoiGianUpBai +
                ", hinhAnh='" + hinhAnh + '\'' +
                ", hashTag='" + hashTag + '\'' +
                ", sc=" + sc +
                '}';
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getThoiGianUpBai() {
        return thoiGianUpBai;
    }

    public void setThoiGianUpBai(int thoiGianUpBai) {
        this.thoiGianUpBai = thoiGianUpBai;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getHashTag() {
        return hashTag;
    }

    public void setHashTag(String hashTag) {
        this.hashTag = hashTag;
    }
}
