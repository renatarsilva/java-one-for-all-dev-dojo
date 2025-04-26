package academy.devdojo.maratonajava.introducao;

public class Pessoa {
    private String name;
    /**
    * <html>
    * <h1> Isto á um título! </h1>
    * <p> Esse é um paragrafo </p>
    * </html>
    **/
    public Pessoa (String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                '}';
    }
}
