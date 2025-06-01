package lambda2;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class SortObject {
    public static void main(String[] args) {
        List < Student > student_list = new ArrayList<Student>();
        student_list.add(new Student("Adriana Jamie", 15, "X"));
        student_list.add(new Student("Felix Uisdean", 15, "X"));
        student_list.add(new Student("Conceicao Palmira", 14, "X"));
        student_list.add(new Student("Jair Camila", 14, "X"));
        student_list.add(new Student("Micaela Rosana", 15, "X"));

        student_list.sort(Comparator.comparing(Student::getAge));
        for(Student student : student_list) {
//            System.out.println(Student.getName() + " - " + Student.getAge() + " - " + Student.getSClass());
        }
    }
}
