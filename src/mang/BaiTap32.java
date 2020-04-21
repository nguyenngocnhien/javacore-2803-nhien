package mang;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BaiTap32 {
    Scanner sc = new Scanner(System.in);
    int arr1[] ={1,2,3,4};
    int arr2[] ={2,5,7,8};
    public void gopMang(){
        int arr3[] = new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }
        Arrays.sort(arr3);
        for (int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]);
        }
    }
    public static void main(String[] args) {
        BaiTap32 bt = new BaiTap32();
        bt.gopMang();
    }
}
