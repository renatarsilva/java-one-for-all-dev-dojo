package academy.devdojo.javaOneForAll.introduction;

public class Class06LoopStatements01 {
    public static void main(String[] args) {

        int count = 0;
//        while(count < 10){
//            System.out.println(++count);
//        }
//        count = 0;
        do{
            System.out.println("Inside do while " + count++);
        } while (count < 3);

        for(int i=0; i < 10 ; i++){
            System.out.println("For "+i);
        }
    }
}

