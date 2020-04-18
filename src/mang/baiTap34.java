package mang;

import java.util.Scanner;

public class baiTap34 {
    int a[];
    public void nhapMang(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số phần tử của mảng : ");
        int n = sc.nextInt();
        a = new int[n];
        for (int i =0;i<a.length;i++){
            System.out.print("Nhập phần tử thứ "+(i+1)+" : ");
            a[i] = sc.nextInt();
        }
    }
    public void xuatMang(){
        System.out.print("Mảng vừa nhập là : ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public void xoaPhanTuTrungNhau(){
        System.out.println();
        int index=0;
        int[] b = new int[a.length];
        for (int i=0;i<a.length;i++){
            boolean duplicate = false;
            for (int j=0;j<b.length;j++){
                if (b[j]==a[i]){
                    duplicate=true;
                    continue;
                }
            }
            if (!duplicate){
                b[index]=a[i];
                index++;
            }
        }
        for (int i=0;i<index;i++){
            System.out.print(b[i]);
        }
    }
    public static void main(String[] args) {
        baiTap34 bt = new baiTap34();
        bt.nhapMang();
        bt.xuatMang();
        bt.xoaPhanTuTrungNhau();
        }
}
