package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {

        int age = 10;
        String category;

          category = age < 15 ? "categoria Infantil" : age >= 15 && age < 18 ? "Categoria Juvenil" : "Categoria adulta";
        System.out.println(category);
    }
}
