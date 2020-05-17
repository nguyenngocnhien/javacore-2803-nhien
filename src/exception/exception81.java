package exception;

public class exception81 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Lỗi thêm phần tử");
        }
        try {
            int zero = 0;
            int average = 10 / zero;
            System.out.println("Average = " + average);
        }catch (ArithmeticException e){
            System.out.println("K được chia cho 0 má ơi");
        }
        try {
            String obj = null;
            System.out.println(obj.length());
            System.out.println("Finished!");
        }
        catch (NullPointerException e){
            System.out.println("String sao mà null được");
        }




    }
}
