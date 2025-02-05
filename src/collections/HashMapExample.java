package collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Employee,String> employeeMap = new HashMap<>();

        Employee jeeva = new Employee(); // There are two ways to assign values to an object. 1. Using setter method , 2. Directly passing values in Constructor

        // Initializing object values using setter method
        jeeva.setId(1);
        jeeva.setName("Jeeva");
        System.out.println(jeeva);

        Employee ajith = new Employee(2, "Ajith");
        System.out.println(ajith);

        Employee jeeva1 = new Employee(1, "Jeeva");

        employeeMap.put(jeeva, "Developer");
        employeeMap.put(ajith, "Tester");
        employeeMap.put(jeeva1,"Singer");

        System.out.println(employeeMap);
        System.out.println(employeeMap.get(jeeva1));

        int jeevaHashCode = jeeva.hashCode();
        System.out.println(jeevaHashCode);
        int jeeva1HashCode = jeeva1.hashCode();
        System.out.println(jeeva1HashCode);

    }
}
