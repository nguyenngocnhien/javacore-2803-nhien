package mang;

import java.util.Scanner;
public class baiTap33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một trạng thái : ");
        String str = sc.nextLine();
        String[] word = str.split(" ");
            int max=0;
            for (int i = 0;i< word.length; i++){
                if (word[i].length()>max){
                    max=word[i].length();
                }
            }
        System.out.println("Từ dài nhất trong câu là : ");
            for (int i=0;i<word.length;i++){
                if (word[i].length()==max){
                    System.out.print(word[i]+" , ");
                }
            }
    }
}
