package academy.devdojo.javaOneForAll.introduction;

public class Class05ConditionalStatements05 {
    public static void main(String[] args) {
        byte day = 5;
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thur");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        char gender = 'F';
        switch (gender){
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
