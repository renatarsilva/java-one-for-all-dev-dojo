package academy.devdojo.javaOneForAll.javacore.Aintroductionclasses.test;

import academy.devdojo.javaOneForAll.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Chile";
        professor.age = 51;
        professor.gender = 'M';

        System.out.println("Name: "+professor.name+" Age:"+professor.age+" Gender:"+professor.gender);

    }
}
