package cc.xpbootcamp.code_smell_kit.$06_mutable_data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MutableList {

    //Mutable Data
    static List<String> stringList = Arrays.asList("b", "a", "c");
    static List arrList = new ArrayList(stringList);

    static void sortAndPrint() {
        removeAndPrint(arrList);

        Collections.sort(arrList);
        arrList.forEach(System.out::println);
    }

    static void removeAndPrint(List<String> list) {
        while (list.size() > 0) {
            System.out.println(list.remove(0));
        }
    }

    public static void main(String[] args) {
        sortAndPrint();
    }


}


