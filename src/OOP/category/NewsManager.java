package OOP.category;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewsManager {
    ArrayList<Category> arrCateGory = new ArrayList<>();
    Category category;
    int n;
    Scanner sc = new Scanner(System.in);
    public void addNews(){
        System.out.print("Nhập số bài báo muốn nhập : ");
        n = sc.nextInt();

        for (int i=0;i<n;i++){
            category = new Category();
            System.out.println("Nhập bài báo thứ "+(i+1)+" :  ");
            category.detailNews();
            arrCateGory.add(category);
        }
    }
    public void show(){
        for (int i=0;i<n;i++){
            arrCateGory.get(i).hienThiDetailNews();
        }
    }
    public void findByCategoryID(){
        System.out.print("Nhập CategoryID bài báo muốn tìm : ");
        int x = sc.nextInt();
        for (int i=0;i<n;i++){
            if (arrCateGory.get(i).getCategoryID()==x){
                System.out.println("Những bài viết có CategoryID = "+category.getCategoryID()+" là :");
                arrCateGory.get(i).hienThiDetailNews();
            }
            else System.out.print("K có bài báo muốn tìm");
        }
    }
    public void updateByidNews(){
        System.out.print("Nhập idNews muốn sửa :");
        int x = sc.nextInt();
        for (int i=0;i<n;i++){
            if (arrCateGory.get(i).getNewsProgram().getIdNews()==x){
                arrCateGory.get(i).detailNews();
            }
        }
    }
}
