import java.util.Scanner;

public class baiTap27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thập phân : ");
        int n,i;
        n= sc.nextInt();
        i=n%8;
        System.out.println(i);
    }
}
