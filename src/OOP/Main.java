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
            Student student = new Student();
            student.nhapSV();
            students[i]=student;
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
