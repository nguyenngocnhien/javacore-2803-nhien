package OOP.category;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        NewsManager newsManager = new NewsManager();
        do {
            System.out.println("--------------------------------");
            System.out.println("0:Thoát ứng dụng");
            System.out.println("1: Thêm báo");
            System.out.println("2: Hiển thị danh sách báo");
            System.out.println("3: Tìm báo thông qua CategoryID");
            System.out.println("4: Sửa báo thông qua idNews");
            System.out.println("--------------------------------s");
            x=sc.nextInt();
            System.out.println("======>");
            switch (x){
                case 1:
                    newsManager.addNews();
                    break;
                case 2:
                    newsManager.show();
                    break;
                case 3:
                    newsManager.findByCategoryID();
                    break;
                case 4:
                    newsManager.updateByidNews();
                    break;
            }
        }while (x!=0);
            System.out.println("");
    }
}
