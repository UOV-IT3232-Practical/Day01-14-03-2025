//6)

import java.util.*;

class Student{
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}
public class question6 {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Kasun", 75));
        students.add(new Student("Oshan", 70));
        students.add(new Student("Lasanga", 85));
        students.add(new Student("Piyumal", 90));
        students.add(new Student("Nazik", 77));

        int totalMarks = 0;
        for(Student student:students){
            totalMarks += student.marks;
        }

        double average  = (double)totalMarks/students.size();
        System.out.println("Average marks of the students: "+average);
    }
}