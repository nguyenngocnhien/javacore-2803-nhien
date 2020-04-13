package mang;

import java.util.Scanner;

public class baiTap31 {
    public static void main(String[] args) {
        int arr[] = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào giá trị của mảng : ");
        for (int i = 0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng được nhập vào là : ");
        for (int x : arr) System.out.print(x+" ");
        for (int i = 0; i<=arr.length-1;i++){
            int temp = arr[i];
            for (int j = 0; j <= arr.length-1;j++){
                if (temp<(arr[j]+1))
                {
                    System.out.println(temp);
                }
            }
        }
        System.out.println("Chuỗi ");
        for (int x : arr) System.out.println(x);

    }
}
