package academy.devdojo.javaOneForAll.javacore.Aintroductionclasses.test;

import academy.devdojo.javaOneForAll.javacore.Aintroductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Maki";
        student.age = 30;
        student.gender = 'F';

        System.out.println(student.name);
    }
}
