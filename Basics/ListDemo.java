package Basics;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();

        names.add("A");
        names.add(1,"C");
        names.add(2,"B");
        names.add(3,"Z");
        names.add("A");
        System.out.println(names);
        System.out.println("Contain Z:"+names.contains("Z"));
        System.out.println("Contains n:"+names.contains("n"));

        System.out.println(names.get(0));
        names.remove("A");
        System.out.println(names);
        names.remove(3);
        System.out.println(names);
        names.clear();
        System.out.println(names);
    }
}
