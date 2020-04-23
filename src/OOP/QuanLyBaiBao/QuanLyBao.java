package OOP.QuanLyBaiBao;

import java.util.Scanner;

public class QuanLyBao {
    int index;
    BaiBao[] baiBaos = new BaiBao[5];
    public void baiBaoList(){
        index=0;
        for (int i=0;i<baiBaos.length;i++){
            baiBaos[i] = new BaiBao();
        }
    }
    public void themBaiBao(){
            baiBaos[index]= new BaiBao();
            BaiBao baiBao = new BaiBao();
            baiBao.nhapBao();
            baiBaos[index]=baiBao;
    }
    public void hienThiBao(){
        for (int i=0;i<baiBaos.length;i++){
            System.out.println(baiBaos[i].toString());
        }
    }

}
