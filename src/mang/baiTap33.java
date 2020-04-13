package mang;

import java.util.Scanner;
public class baiTap33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một trạng thái : ");
        String str = sc.nextLine();
        String[] word = str.split(" ");
            String res ="";
            for (int i = 0;i< word.length; i++){
                for (int j = i;j<word.length;j++){
                    if (word[i].length()>word[j].length()){
                        res = word[i];
                    }
                }
            }
        System.out.print("Từ dài nhất là : "+res);
    }
}
