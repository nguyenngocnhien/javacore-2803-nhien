package vongLap;

import java.util.Scanner;

public class baiTap23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n : ");
        int num = sc.nextInt();
        System.out.print("Số chia hết cho 3 là : ");
        for (int i= 1 ; i <= num; i++){
            if (i%3==0) {
                System.out.print(" "+i);
            }
        }
        System.out.println();
        System.out.print("Số chia hết cho 5 là : ");
        for (int i= 1 ; i <= num; i++){
            if (i%5==0) {
                System.out.print(" "+i);
            }
        }
        System.out.println();
        System.out.print("Số chia hết cho 3 và 5 là : ");
        for (int i= 1 ; i <= num; i++){
            if (i%3==0&&i%5==0) {
                System.out.print(" "+i);
            }
        }
    }
}
