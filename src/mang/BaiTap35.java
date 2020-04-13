package mang;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class BaiTap35 {
    int arr[];
    Scanner sc = new Scanner(System.in);
    public void nhapMang(){
        System.out.print("Nhập số phần tử của mảng : ");
        int n = sc.nextInt();
        arr = new int[n];
        for (int i=0;i<arr.length;i++){
            System.out.print("Nhập phần tử thứ "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
    }
    public void xuatMang(){
        System.out.print("Mảng vừa nhập là : ");
        for (int x : arr
        ) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public void tBCong(){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2!=0 && i%2==0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
    public void min(){
        int min = arr[1];
        System.out.println();
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là : "+min);
    }
    public void max(){
        int max = arr[1];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        System.out.println("Giá trị lớn nhất trong mảng là : "+max);
        }
    }
    public void soCP() {
        int dem = 0;
        for (int i = 0; i < arr.length; i++) {
            int res = (int) Math.sqrt(arr[i]);
            if (res * res == arr[i]) {
                dem++;
            }
        }
        System.out.println("Mảng có "+dem+" số chính phương : ");
    }
        public boolean kiemTraSoNguyenTo(int n){
        if (n<2){return false;}
        for (int i =2 ; i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
        }
        public void xuatSoNguyenTo(){
            for (int i =0;i<arr.length;i++){
                if (kiemTraSoNguyenTo(arr[i])){
                    System.out.println(arr[i]+" là số nguyên tố");
                }
            }
        }
        public void thayThePhanTuAm(){
            System.out.print("Mảng sau khi thay thế phần tử âm : ");
             for (int i=0;i<arr.length;i++){
                 if (arr[i]<0){
                     arr[i]=0;
                     System.out.print(arr[i]+" ");
                 }
             }
        }
        public void xoaCacPhanTuAm(){
        int[] a = new int[arr.length];
        int index=0;
        System.out.println();
        for (int i =0;i<arr.length;i++){
            if (arr[i]>0) {
                a[index]=arr[i];
                index++;
            }
        }
            System.out.print("Mảng sau khi xóa các phần tử âm là : ");
        for (int i=0;i<index;i++){
            System.out.print(a[i]+" ");
        }
        }
        // 0
        //3 7 1 i
        //3 7 1 j
        // 1
        public void sapXep(){
        System.out.println();
        int index = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                   index = arr[i];
                   arr[i]=arr[j];
                   arr[j]=index;
                }
            }
        }
        System.out.print("Mảng sau khi sắp xếp là : ");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        }
    public static void main(String[] args) {
        BaiTap35 bt = new BaiTap35();
        bt.nhapMang();
        bt.xuatMang();
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Tính trung bình cộng các số lẻ ở vị trí chẵn\n" +
                "2. Tìm số lớn nhất trong mảng vừa nhập\n" +
                "3. Tìm vị trí các số nhỏ nhất trong mảng\n" +
                "4. Đếm các số chính phương có trong mảng\n" +
                "5. Hiện thị các số nguyên tố có trong mảng lên màn hình\n" +
                "6. Thay thế các phần tử âm có trong mảng bằng giá trị 0\n" +
                "7. Xóa các phần tử âm có trong mảng\n" +
                "8. Sắp xếp mảng đã nhập theo thứ tự giảm dần\n");
       for (int i=0;i<=8;i++){
           System.out.print("Nhập lệnh muốn thực thi : ");
           int a = sc.nextInt();
           switch (a){
               case 1:
                   bt.tBCong();
                   break;
               case 2:
                   bt.min();
                   break;
               case 3:
                   bt.max();
                   break;
               case 4:
                   bt.soCP();
                   break;
               case 5:
                   bt.xuatSoNguyenTo();
                   break;
               case 6:
                   bt.thayThePhanTuAm();
                   break;
               case 7:
                   bt.xoaCacPhanTuAm();
               case 8:
                   bt.sapXep();
                   break;
           }
           System.out.println();
       }
    }
}
