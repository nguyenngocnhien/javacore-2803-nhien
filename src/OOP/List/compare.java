package OOP.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class compare {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<10000;i++){
            arrayList.add(i);
        }
        long start = System.nanoTime();
        for (int i=0;i<1000;i++){
            arrayList.get(5000);
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("Array : "+timeElapsed);
        System.out.println();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i=0;i<10000;i++){
            ll.add(i);
        }
        long starts = System.nanoTime();
        for (int i=0;i<1000;i++){
            ll.get(5000);
        }
        long finishs = System.nanoTime();
        long timeElapseds = finishs - starts;
        System.out.println("Lindked : "+timeElapseds);
    }
}
