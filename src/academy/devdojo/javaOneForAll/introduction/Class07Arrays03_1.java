package academy.devdojo.javaOneForAll.introduction;

public class Class07Arrays03_1 {
    public static void main(String[] args) {
        int [] numbers = new int [3];
        int [] numbers2 = {1,2,3,4,5};
        int [] numbers3 = new int []{5,4,3,2,1,0};

        for (int i = 0; i < numbers2.length; i++){
            System.out.println(numbers2[i]);
        }
        for (int num: numbers3){
            System.out.println(num);
        }
    }
}
