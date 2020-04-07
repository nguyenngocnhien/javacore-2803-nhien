import java.util.Scanner;

public class baiTap27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thập phân : ");
        int n,i;
        String hex = "";
        char charhex;
        n= sc.nextInt();
        if (n<=0) return;
        while (n>0){
            i = n%16;
            if(i<=9 && i>=0){
                charhex =(char) (i+'0');
            }
            else {
                charhex= (char) (i - 10 + 'A');
            }
            hex = charhex+ hex;
            n= n/16;
        }
        System.out.println(hex);
    }
}
