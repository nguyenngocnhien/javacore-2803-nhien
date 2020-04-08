import java.util.Scanner;

public class baiTap25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0 ; i<=n; i++){
            sum+=i;
        }
        float a = sum;
        float g = n;
        float avg = sum/g;
        System.out.println("Tổng từ 1 đến "+n+" là : "+sum);
        System.out.println("Trung bình là : " +avg);
    }
}
