package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {

        int count = 0;

        // while
//        while (count < 10){
//            System.out.println(++count);
//        }

        //do-while
//        count = 0;
//        do {
//            System.out.println("dento do do-while "+ ++count);
//        } while (count < 10);

        // for, para lista de valores, vai de um em um, geralmente a variavel vai dentro da condicao
        // i comecando de zero, até i menos 10, incrementando de um em um, faca:
        for (int i=0; i<10; i++){
            System.out.println("For"+i);

        }
    }
}
