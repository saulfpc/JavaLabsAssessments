package labs.labTwelve;

import java.util.*;

public class exercise1234 {

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Test1");
        lst.add("Test2");
        lst.add("Test3");

        List<String> lst1 = new ArrayList<>();
        lst1.add("Test11");
        lst1.add("Test21");
        lst1.add("Test31");

        List<String> combineList = new ArrayList<>();
        combineList.addAll(lst);
        combineList.addAll(lst1);

        System.out.println("First List");
        System.out.println(lst);
        System.out.println("Second List");
        System.out.println(lst1);
        System.out.println("combine list" + combineList);

        //exercise 2
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Ram", 3000));
        list.add(new Employee("John", 6000));
        list.add(new Employee("Crish", 2000));
        list.add(new Employee("Tom", 2400));
        Collections.sort(list, new MySalaryComp());
        System.out.println("Sorted list entries: ");
        for (Employee e : list) {
            System.out.println(e);
        }

        //Exercise 3
        List<String> books = new LinkedList<>();
        books.add("Sapiens");
        books.add("Dare to Lead");
        books.add("The mind of the leader");
        books.add("Ego is the enemy");

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        System.out.println(books.size());
        for (int i = books.size() - 1; i >= 0; i--) {
            System.out.println(books.get(i));
        }

        //exercise4

        int[] numbers = {9, 5, 6, 7};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.stream(numbers).max());
        System.out.println(Arrays.stream(numbers).min());

    }

    static class MySalaryComp implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
            if (e1.getSalary() < e2.getSalary()) {
                return 1;
            } else {
                return -1;
            }
        }


    }
}
