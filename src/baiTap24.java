import java.util.Scanner;
public class baiTap24 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập n : ");
            int n = sc.nextInt();
            String fibonacci = "";
            if (n == 1) {
                fibonacci = "0";
            } else if (n == 2) {
                fibonacci = "0,1";
            } else {
                int first = 0;
                int second = 1;
                fibonacci = first + "," + second;
                for (int i = 3; i <= n; i++) {
                    int nb = first + second;
                    fibonacci = fibonacci + "," + nb;
                    first = second;
                    second = nb;
                }
            }
            System.out.println(fibonacci);

        }
    }