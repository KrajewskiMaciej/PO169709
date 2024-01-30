package ZestawE17.zad2.university;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public record Student(int id, String name, double averageGrade) {

}

class AverageGradeComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return Double.compare(s2.averageGrade(), s1.averageGrade());
    }
}

class IdComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return Integer.compare(s1.id(), s2.id());
    }
}

class TestStudent{
    public static void main(String[] args) {
        List<Student> studenci = new ArrayList<>();
        studenci.add(new Student(32,"Adam",4.95));
        studenci.add(new Student(125,"Jan",3.15));
        studenci.add(new Student(675,"Damian",4.0));
        studenci.add(new Student(12,"Anna",3.99));
        studenci.add(new Student(41,"Ala",5.0));

        Collections.sort(studenci, new AverageGradeComparator());
        System.out.println("Sortowanie po średniej ocen:");
        studenci.forEach(System.out::println);

        System.out.println("\n-----------------------------------\n");

        Collections.sort(studenci,new IdComparator());
        System.out.println("Sortowanie po Id");
        studenci.forEach(System.out::println);
    }
}
