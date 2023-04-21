package lists.linkedlist;

public class Main {

    public static void main(String[] args) {
        //! Linked Lists are a list of nodes, where each node contains the data and a reference to the next node
            //! In a Linked List the head is the first node, and the tail is the last node,
            //! In other words, we only need to know the head to traverse the list
            //! The tail is the last node in the list, and it points to null
        //! Linked Lists are not as efficient as ArrayLists, but they are more flexible
            //! We can add and remove items from the beginning of the list in constant time, because there are no shifting operations
            //! We can add and remove items from the end of the list in linear time

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe   = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(janeJones);
        System.out.println(list.isEmpty());
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println("size = " + list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println("size = " + list.getSize());

    }
}
