import java.util.Scanner;
public class baiTap28 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập a :");
            int a = sc.nextInt();
            System.out.print("Nhập b :");
            int sum =0;
            int b = sc.nextInt();
            for (int i = 0;i<b;i++){
                sum = sum + a;
            }System.out.println(sum);
        }
    }
