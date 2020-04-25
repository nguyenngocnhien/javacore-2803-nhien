package OOP.QuanLyBaiBao;

import java.util.Scanner;

public class QuanLyBao {
    BaiBao[] baiBaos = new BaiBao[3];
    public void xemTinMoiNhat(){
        int baiMoi=baiBaos[1].getThoiGianUpBai();
        for (int i=0;i<baiBaos.length;i++){
            if (baiBaos[i].getThoiGianUpBai()>baiMoi){
                baiMoi=baiBaos[i].getThoiGianUpBai();
            }
        }
        System.out.println(baiMoi);
    }
    public void themBaiBao(){
        BaiBao baiBao = new BaiBao();
        for (int i=0;i<baiBaos.length;i++){
            baiBao.nhapBao();
            baiBaos[i]=baiBao;
        }
    }
    public void hienThiBao(){
        for (int i=0;i<baiBaos.length;i++){
            System.out.println(baiBaos[i].toString());
        }
    }
}
