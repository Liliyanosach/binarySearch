import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Liliya", 50_000);
        Employee employee2 = new Employee(246, "Alice", 60_000);
        Employee employee3 = new Employee(34, "Zlata", 40_000);
        Employee employee4 = new Employee(486, "Evgenii", 80_000);
        Employee employee5 = new Employee(554, "Aleks", 70_000);
        Employee employee6 = new Employee(34, "Kate", 75_000);
        Employee employee7 = new Employee(7, "Nate", 30_000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        System.out.println(employeeList);

        Collections.sort(employeeList);
        System.out.println(employeeList);

        int index = Collections.binarySearch(employeeList,new Employee(7, "Nate", 30_000));
        System.out.println(index);
    }
}
