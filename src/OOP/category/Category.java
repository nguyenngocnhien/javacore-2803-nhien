package OOP.category;

import java.util.Scanner;

public class Category {
    private String categoryName;
    private int categoryID;
    private NewsProgram newsProgram;
    public Category() {
    }

    public Category(String categoryName, int categoryID, NewsProgram newsProgram) {
        this.categoryName = categoryName;
        this.categoryID = categoryID;
        this.newsProgram = newsProgram;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public NewsProgram getNewsProgram() {
        return newsProgram;
    }

    public void setNewsProgram(NewsProgram newsProgram) {
        this.newsProgram = newsProgram;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void detailNews(){
        newsProgram = new NewsProgram();
        newsProgram.add();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập CategoryID : ");
        categoryID = sc.nextInt();
    }
    public void hienThiDetailNews(){
        newsProgram.views();
        System.out.print("Thể Loại : "+getCategoryName());
        System.out.println();
    }

}
