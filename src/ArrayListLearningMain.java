import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLearningMain {
    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<String>();
        List<String> stringList = new LinkedList<String>();
        stringList.add("first string");
        stringList.add("remove");
        stringList.add("remove");
        stringList.add("forth string");
//        stringList.add(null);
//        stringList.clear();

        System.out.println("Список состоит из " + stringList.size() + " Элементов");
        if (!stringList.isEmpty()) {
            System.out.println("stringList is Not Empty");
            for (String element :stringList) {
                if (element.equals("remove")) {
//                    stringList.remove(element);
                }
            }

        } else {
            System.out.println("stringList is Not Empty");
        }
        System.out.println("Список состоит из " + stringList.size() + " Элементов");
        for (String element: stringList) {
            System.out.println(element);

        }

    }
}
