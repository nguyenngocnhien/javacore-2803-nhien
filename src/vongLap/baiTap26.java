package vongLap;

import java.util.Scanner;
public class baiTap26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nhị phân : ");
        int n = sc.nextInt();
        int p =0;
        int decNumber = 0;
        while (n>0){
            decNumber += (n%10)* Math.pow(2,p);
            p++;
            n/=10;
        }
        System.out.print(decNumber);


    }
}
