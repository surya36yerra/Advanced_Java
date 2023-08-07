
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {


     int id,salary;
     String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Employee(int id, String name, int salary) {
         this.id = id;
         this.name = name;
         this.salary = salary;
     }
 }


    public class streamTest1{
            public static void main(String args[]) {

                List<Employee> l1 = new ArrayList<Employee>();
                l1.add(new Employee(123, "surya", 20000));
                l1.add(new Employee(456, "surya", 2000));
                l1.add(new Employee(789, "surya", 18000));
                l1.add(new Employee(999, "surya", 20000));


                List<Integer> l2 = l1.stream().filter(t -> t.salary > 5000)
                        .map(t -> t.salary)
                        .collect(Collectors.toList());

                System.out.println(l2);

                l1.stream().filter(t -> t.id > 200).forEach(t-> System.out.println(t.id));

//                List<Integer> l3 = l1.stream().collect(Collectors.summingDouble(p->p.salary));
//                System.out.println(l3);

                System.out.println(l1.stream().filter(t -> t.id > 200).count());

                Employee e = l1.stream().max((p1,p2)->p1.salary>p2.salary?1:-1).get();
                System.out.println(e.salary);


                Set<Integer> set = l1.stream().filter(p->p.salary>1000).map(p->p.salary).collect(Collectors.toSet());
                System.out.println(set);

                Map<Integer,String> map = l1.stream().collect(Collectors.toMap(p->p.id, p->p.name));
                System.out.println(map);

                List<Integer> productPriceList =
                        l1.stream()
                                .filter(p -> p.salary > 30000) // filtering data
                                .map(Employee::getSalary)         // fetching price by referring getPrice method
                                .collect(Collectors.toList());  // collecting as list
                System.out.println(productPriceList);

            }
     }



