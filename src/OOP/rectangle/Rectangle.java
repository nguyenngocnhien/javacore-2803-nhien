package OOP.rectangle;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle {
    private int width,height;
    ArrayList<Rectangle> arrRec = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Rectangle rectangle;
    public Rectangle() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void nhap(){
        System.out.println("Nhập chiều rộng : ");
        this.width = sc.nextInt();
        System.out.println("Nhập chiều dài : ");
        this.height = sc.nextInt();
    }
   public void hienThi(){
       System.out.println("Chiều rộng là : "+width);
       System.out.println("Chiều dài là : "+height);
   }
    public void addRec(int x){
        for (int i=0;i<x;i++){
            rectangle = new Rectangle();
            rectangle.nhap();
            arrRec.add(rectangle);
        }
    }
    public void show(){
        for (int i=0;i<arrRec.size();i++){
            arrRec.get(i).hienThi();
        }
    }
    public void tinhChuVi(){
        int p = 0;
        for (int i=0;i<arrRec.size();i++){
          p  =(arrRec.get(i).getWidth()+arrRec.get(i).getHeight())*2;
        }
        System.out.println("Chu vi là : "+p);
    }
    public void tinhDienTich(){
        int s =0;
        for (int i=0;i<arrRec.size();i++){
            s  =arrRec.get(i).getWidth()*arrRec.get(i).getHeight();
            if (arrRec.get(i).getWidth()==arrRec.get(i).getHeight()){
                System.out.println("Hình vừa nhập là hình vuông");
                for(int x = 0; x < rectangle.getWidth(); x++) {
                    for(int j = 0; j < rectangle.getWidth(); j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("--------------------------------------------------");
            }
            else {
                System.out.println("Hình vừa nhập là hình chữ nhật");
                for(int a = 0; a < rectangle.getHeight(); a++) {
                    for(int b = 0; b < rectangle.getWidth(); b++) {
                        System.out.print("*");
                    }
                    System.out.println("");
            }
        }
        System.out.println("Diện tích là : "+s);
    }
    }
}
