package lists.vector;

import lists.arraylist.Employee;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        //! Vector is a thread safe version of ArrayList
        //! It is synchronized, so only one thread can access it at a time
        //! It is not as efficient as ArrayList, so if you don't need the thread safety, use ArrayList
        //! ArrayList are not threadsafe, so if you need to use them in a multi-threaded environment, you need to synchronize them yourself

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));



    }
}
