package OOP.login;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManagement {
    int totalUser;
    User user;
    Scanner sc = new Scanner(System.in);
    boolean duplicate = true;
    ArrayList<User> userArrayList = new ArrayList<>();
    public void nhapUser(){
        do {
            try {
                System.out.println("Nhập số User muốn nhập : ");
                totalUser = sc.nextByte();
                duplicate=true;
            }catch (InputMismatchException e){
                System.out.println("Chỉ nhập số, vui lòng nhập lại");
                duplicate=false;
                sc.nextLine();
            }
        }while (!duplicate);
        for (int i=0;i<totalUser;i++){
            user = new User();
            System.out.print("Nhập ID : ");
            do {
                duplicate=false;
                try {
                    user.setId(sc.nextInt());
                    sc.nextLine();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("ID chỉ nhập số, vui lòng nhập lại");
                    duplicate=true;
                    sc.nextLine();
                }
            }while (duplicate);
            do {
                System.out.print("Nhập UserName : ");
                user.setUserName(sc.nextLine());
                String Us = "[\\w]{1,}";
                if (Pattern.matches(Us,user.getUserName())==false){
                    System.out.println("UserName k được chứa khoảng trắng hoặc ký tự đặt biệt");
                    duplicate=false;
                }else duplicate=true;
            }while (!duplicate);
            do {
                System.out.print("Nhập PassWord : ");
                user.setPassWord(sc.nextLine());
                String Us = "[\\S]{1,}";
                if (Pattern.matches(Us,user.getUserName())==false){
                    System.out.println("PassWork k được chứa khoảng trắng");
                    duplicate=false;
                }else duplicate=true;
            }while (!duplicate);
            do {
                System.out.print("Nhập FirstName & LastName : ");
                user.setDisplayName(sc.nextLine());
                String Us = "[a-zA-Z]{1,}";
                if (Pattern.matches(Us,user.getDisplayName())==false){
                    System.out.println("K nhập dấu, k chứa kí tự hoặc số");
                    duplicate=false;
                }else duplicate=true;
            }while (!duplicate);
           do {
               System.out.print("Nhập Email : ");
               user.setEmail(sc.nextLine());
               String EMAIL_PATTERN =
                       "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
               if (Pattern.matches(EMAIL_PATTERN,user.getEmail())==true){
                    duplicate=true;
               }else {
                   System.out.println("Sai định dạng email");
                   duplicate=false;
               }
           }while (!duplicate);
            userArrayList.add(user);
        }
        System.out.println(userArrayList);
    }
    public void login(){
        String uName,pWord;
        System.out.println("Nhập UserName");
        uName=sc.nextLine();
        for (int i=0;i<userArrayList.size();i++){
            if(uName.equals(userArrayList.get(i).getUserName())){
                System.out.println("Nhập PassWork");
                pWord = sc.nextLine();
                if (pWord.equals(userArrayList.get(i).getPassWord())){
                    System.out.println("Đăng nhập thành công");
                    System.out.println(userArrayList);
                }else System.out.println("Sai PassWord");
            }
        }
    }
}
