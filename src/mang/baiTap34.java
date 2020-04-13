package mang;

import java.util.Scanner;

public class baiTap34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Mời nhập các phần tử trong mảng");
        for (int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Các phần tử trong mảng là : ");
        for (int x : a) System.out.print(x+" ");
        int b[] = new int[5];
        for (int i = 0 ; i<a.length;i++){
            if(b.equals(a[i])){

            }
        }

    }
}
