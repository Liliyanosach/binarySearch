package hashCode;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEx {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student("Liliya", "Nosach", 4);
        Student student2 = new Student("Evgenii", "Nosach", 4);
        Student student3 = new Student("Bob", "Ivanov", 5);

        map.put(student1, 4.4);
        map.put(student2, 4.8);
        map.put(student3, 3.5);

        System.out.println(map);

        Student student4 = new Student("Liliya", "Nosach", 4);
        Student student5 = new Student("Igor", "Blanc", 1);
        boolean result = map.containsKey(student4);
        System.out.println(result);

    }
}
