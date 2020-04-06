import java.util.Scanner;
public class baiTap22 {
    public static void main(String[] args) {
                int n,i;
                System.out.print("Nhập số thập phân : ");
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
                String str = "";
                while (n>0){
                    i=n%2;
                    str = i + str;
                    n=n/2;
                }
                System.out.println(str);
            }
        }
