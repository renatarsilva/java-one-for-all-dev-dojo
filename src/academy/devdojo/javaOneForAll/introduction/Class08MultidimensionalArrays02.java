package academy.devdojo.javaOneForAll.introduction;

public class Class08MultidimensionalArrays02 {
    private int numero;
    public Class08MultidimensionalArrays02(int numero){
        this.numero=numero;
    }
    public static void main(String[] args) {
        int[][] array = new int[3][];
        int[] numbers = {1,2,3};

        array[0] = new int[]{1,2};
        array[1] = numbers;
        array[2] = new int[]{1,2,3,4,5,6};

        int[][] arrays2 = {{1,2}, {1,2,3}, {1,2,3,4,5,6}};

        for(int[] baseArray : array){
            System.out.println("--- \n");
            for(int num : baseArray){
                System.out.print(num + " ");
            }
        }
    }
}
