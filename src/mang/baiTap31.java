package mang;

import java.util.Scanner;

public class baiTap31 {
    Scanner sc = new Scanner(System.in);
    int arr[];
    public void nhapmang(){
        System.out.print("Mời nhập  vào số phần tử trong mảng : ");
        int n=sc.nextInt();
        arr = new int[n];
        for (int i = 0;i<=arr.length-1;i++){
            System.out.print("Mời bạn nhập phần tử thứ "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            }
     public void timChuoiLienTiep(){
        int dem=1;
        int max=0;
        /*1 2 3 1*/
        System.out.println();
        for (int i=0;i<arr.length-1;i++){
                if (arr[i+1]-arr[i]==1){
                    dem++;
                    if (dem>max){
                        max=dem;
                    }
                }
                else {
                    dem=1;
                }
        }
         System.out.println("Độ dài liên tiếp lớn nhất trong mảng là : "+max);
     }
    public static void main(String[] args) {
    baiTap31 bt = new baiTap31();
    bt.nhapmang();
    bt.timChuoiLienTiep();
    }
}
