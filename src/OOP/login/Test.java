package OOP.login;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManagement userManagement = new UserManagement();
        userManagement.nhapUser();
        userManagement.login();
    }
}
