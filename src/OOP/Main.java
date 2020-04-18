package OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sinh viên : ");
        int n =  sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i=0;i<n;i++){
            System.out.println("Nhập vào thông tin sinh viên thứ "+(i+1)+" : ");
            students[i] = new Student();
            System.out.print("Tên : ");
            students[i].setTen(sc.nextLine());
            System.out.print("Tuổi : ");
            students[i].setTuoi(Integer.valueOf(sc.nextLine()));
            System.out.print("Địa chỉ : ");
            students[i].setDiaChi(sc.nextLine());
            System.out.print("Chuyên Ngành : ");
            students[i].setChuyenNganh(sc.nextLine());
            System.out.print("Mssv : ");
            students[i].setMssv(sc.nextLine());
            System.out.print("Điểm trung bình : ");
            students[i].setDiem(Float.valueOf(sc.nextLine()));
        }
        Student sx = null;
        for (int i=0;i<students.length-1;i++){
            for (int j=i+1;j<students.length;j++){
                if (students[i].getTuoi()>students[j].getTuoi()){
                    sx=students[i];
                    students[i]=students[j];
                    students[j]=sx;
                }
            }
        }
        for (Student st : students){
            System.out.println("Họ và tên: "+st.getTen()+"  Tuổi : "+st.getTuoi());
        }
    }
}
