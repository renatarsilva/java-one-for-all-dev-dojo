package academy.devdojo.javaOneForAll.javacore.Aintroductionclasses.test;

import academy.devdojo.javaOneForAll.javacore.Aintroductionclasses.domain.Car; // import the first file;

public class catTest01 {
    public static void main(String[] args) {
        Car car1 = new Car(); // <- instantiate the class, turning the class into an object;
        Car car2 = new Car();

        car1.name = "Ferrari1"; // <- define the attributes, object.attribute defined in the first file;
        car1.model = "Enzo";
        car1.year = 2007;

        car2.name = "Mustang";
        car2.model = "GT 500";
        car2.year = 1968;

        System.out.println("Car 1");

        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);

        System.out.println("\nCar 2");

        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);

    }
}
