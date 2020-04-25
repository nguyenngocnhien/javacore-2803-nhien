package OOP.QuanLyBaiBao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyBao quanLyBao = new QuanLyBao();
        Scanner in = new Scanner(System.in);
        int x;
        do
        {
            System.out.println("------------------------------------");
            System.out.println("|0. Thoat ung dung|");
            System.out.println("|1. Them Bai Bao|");
            System.out.println("|2. Hien Thi Danh Sach Bao|");
            System.out.println("|3. Xem Tin Moi Nhat|");
            System.out.println("-------------------------------------");
            x=in.nextInt();
            System.out.println("======>>");
            switch(x)
            {
                case 1:
                    quanLyBao.themBaiBao();
                    break;
                case 2:
                    quanLyBao.hienThiBao();
                    break;
                case 3:
                    quanLyBao.xemTinMoiNhat();
            }
        }while(x!=0);
        System.out.println("");
    }
}
