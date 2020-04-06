import java.util.Scanner;

public class baiTap21 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int g = 1; g <= 2 * i - 1; g++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
