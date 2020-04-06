import java.util.Scanner;

public class baiTap25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số : ");
        int n = sc.nextInt();
        String str = "";
            n = n/2;
            str = n+""+n;
            System.out.println(str);

    }
}
