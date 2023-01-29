package chapter17.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ProcessingEmployees {
    public static void main(String[] args) {
        //todo: initialize array of Employees
        Employee[] employees = {
                 new Employee("Jason", "Red", 5000, "IT"),
                 new Employee("Ashley", "Green", 7600, "IT"),
                 new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                 new Employee("James", "Indigo", 4700.77, "Marketing"),
                 new Employee("Luke", "Indigo", 6200, "IT"),
                 new Employee("Jason", "Blue", 3200, "Sales"),
                 new Employee("Wendy", "Brown", 4236.4, "Marketing")
        };
        List<Employee> staffs = Arrays.asList(employees);
        //todo: display all Employees
        System.out.println("Complete employee list: ");
        staffs.stream().forEach(System.out::println);

        Predicate<Employee> fourToSixThousand =
                e->(e.getSalary()>=4000 && e.getSalary()<= 6000);

        //todo: Display Employees with salaries in the range $4000-6000
        //todo: sorted into ascending order by salary
        System.out.printf("%nEmployees earning $4000-$6000 per month sorted by salary:%n");
        staffs.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
        //todo: Display first Employee with salary in the range $4000-$6000
        System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
                                            staffs.stream()
                                                    .filter(fourToSixThousand)
                                                    .findFirst()
                                                    .get());
    }
}
