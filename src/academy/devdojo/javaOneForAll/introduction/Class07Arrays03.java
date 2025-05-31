package academy.devdojo.javaOneForAll.introduction;

public class Class07Arrays03 {
    public static void main(String[] args) {
        String [] names = new String[3];

        names [0] = "Maki";
        names [1] = "Null";
        names [2] = "Levi";

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}

