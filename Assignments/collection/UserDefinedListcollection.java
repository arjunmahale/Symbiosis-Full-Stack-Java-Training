package newPractice;

import java.util.*;

public class UserDefinedListcollection {
    public static void main(String[] args) {
        int num;
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(2);
        list.add(3);

        ListIterator<Integer> li = list.listIterator();

        System.out.println("\nDisplaying All Records");
        li = list.listIterator(); // Reset the iterator
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("\nDisplaying Even Numbers");
        li = list.listIterator(); // Reset the iterator
        while (li.hasNext()) {
            num = li.next();
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.println("\nDisplaying odd Numbers");
        li = list.listIterator(); // Reset the iterator
        while (li.hasNext()) {
            num = li.next();
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}