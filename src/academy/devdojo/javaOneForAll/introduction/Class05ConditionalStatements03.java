package academy.devdojo.javaOneForAll.introduction;

public class Class05ConditionalStatements03 {
    public static void main(String[] args) {
        double salary = 3000D;
        String shouldBuyMessage = "buy PS5";
        String shouldNotBuymessage = "don't buy PS5";

        String displayMessage = salary > 2000 ? shouldBuyMessage : shouldNotBuymessage;
        boolean shouldIBuy = salary > 2000 ? true : false;
        System.out.println(displayMessage);
}
}
