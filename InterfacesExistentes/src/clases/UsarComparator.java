package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsarComparator {
    public static void main(String args[]) {
        List<String> strings = new ArrayList<>();
        strings.add("AA");
        strings.add("bb");
        strings.add("CC");
        strings.add("dd");
        strings.add("EE");

        Collections.sort(strings);
        System.out.println("Ordenamiento normal: ");
        for (String str : strings) {
            System.out.println(str);
        }

        Comparator<String> comp = (str1, str2) -> {
            return str1.compareToIgnoreCase(str2);
        };
        Collections.sort(strings, comp);
        System.out.println("Ordenamiento con comparator");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
