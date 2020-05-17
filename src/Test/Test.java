package Test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        double soA = 0;
        double soB = 0;
        int t = 0;
        Scanner Nhap = new Scanner(System.in);
        String str = "";

        do
        {
            System.out.print("Hãy nhập một số vào : ");

            str = Nhap.nextLine();

            Pattern pattern = Pattern.compile("\\d*");
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                soA = Integer.parseInt(str);
                t = 1;
            } else
            {
                System.out.println("Bạn vừa nhập vào không phải số, vui lòng nhập lại !");
            }
        } while(t != 1);
//        ArrayList<HoSoHocSinh> arrHoSo = new ArrayList<>();
//        int n;
//        HoSoHocSinh hoSoHocSinh;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập số học sinh: ");
//        n = scanner.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập thông tin học sinh thứ " + (i + 1) + ": ");
//            hoSoHocSinh = new HoSoHocSinh();
//            hoSoHocSinh.nhapThongTinHoSo();
//            arrHoSo.add(hoSoHocSinh);
//        }
//
//        for (int i = 0; i < arrHoSo.size(); i++) {
//            System.out.println("\nThông tin học sinh thứ " + (i + 1) + ": ");
//            arrHoSo.get(i).hienThiThongTinHoSo();
//        }
//
//        System.out.println("\nNhững Học Sinh có quê ở Thái Nguyên là: ");
//        // hiển thị những học sinh có quê ở Thái Nguyên
//        for (int i = 0; i < arrHoSo.size(); i++) {
//            if (arrHoSo.get(i).getNguoi().getQueQuan().equalsIgnoreCase("Thái Nguyên")) {
//                arrHoSo.get(i).hienThiThongTinHoSo();
//            }
//        }
//
//        System.out.println("\nNhững học sinh học lớp 10A1 là: ");
//        // hiển thị những học sinh học lớp 10A1
//        for (int i = 0; i < arrHoSo.size(); i++) {
//            if (arrHoSo.get(i).getLop().equalsIgnoreCase("10A1")) {
//                arrHoSo.get(i).hienThiThongTinHoSo();
//            }
//        }
    }
}
