package OOP.QuanLyBaiBao;

import java.util.Scanner;

public class DanhMuc extends BaiBao {
    private int loaiBao;

    public DanhMuc() {
    }

    public DanhMuc(int loaiBao) {
        this.loaiBao = loaiBao;
    }
    public int getLoaiBao() {
        return loaiBao;
    }

    public void setLoaiBao(int loaiBao) {
        this.loaiBao = loaiBao;
    }
    public void nhap(){
        super.nhapBao();
        System.out.println("Loại Báo (1=Bóng Đá, 2=Thế Giới, 3=Ẩm Thực Và Đời Sống, 4=Sắc Đẹp) ");
        loaiBao = sc.nextInt();
    }

    @Override
    public String toString() {
        String temp;
        if(loaiBao==1){
            temp="Bóng Đá";
        }
        else if(loaiBao==2){
            temp="Thế Giới";
        }
        else if(loaiBao==3){
            temp="Ẩm Thực Và Đời Sống";
        }
        else temp="Sắc Đẹp";

        return "DanhMuc{" + super.toString()+
                "loaiBao='" + loaiBao + temp +
                '}';
    }
}
