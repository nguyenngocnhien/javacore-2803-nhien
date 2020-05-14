package OOP.List;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Orange");
        color.add("White");
        color.add("Black");
        System.out.println(color);
        color.add(3,"Yellow");
        System.out.println(color);
    }
}
