package lists.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //! ArrayLists are good for random access if you have the index and iterating through the list
        //! It is not so good for adding and removing elements from anywhere but the end
        //! It is also not so good for searching for elements in the list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("second " + employeeList.get(1)); // since ArrayList extends List, time complexity is O(1) (constant time)

        System.out.println(employeeList.isEmpty()); // false

        employeeList.set(1, new Employee("John", "Adams", 4568)); // replace the second element with a new Employee object
        employeeList.add(3, new Employee("John", "Doe", 4567)); // add a new Employee object at index 3, shifting the rest of the elements to the right. Worst case time complexity is O(n) (linear time)
        System.out.println("\nAfter replacing the second element with a new Employee object:");
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size()); // 4


        Object[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]); // convert the ArrayList to an array
        System.out.println("\nArray of employees:");
        for (Object employee : employeeArray) {
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22))); // false. We think they should be equal, but this is a new instance (another memory address) of the Employee object, so it's not equal to the one in the ArrayList

        // Since the equals method now actually checks for values, we can use the indexOf method to find the index of an Employee object in the ArrayList
        System.out.println("\nJohn Doe index = " + employeeList.indexOf(new Employee("John", "Doe", 4567))); // 1. This is the index of the first occurrence of the Employee object in the ArrayList
    }
}
