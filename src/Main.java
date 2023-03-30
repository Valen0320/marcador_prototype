import model.ClonadorMarcadores;
import model.Marcador;
public class Main {
    public static void main(String[] args) {
        ClonadorMarcadores clonadorMarcadores = new ClonadorMarcadores();

        // Clonamos el marcador verde y lo modificamos.
        Marcador marcadorVerde = clonadorMarcadores.clonarMarcador("verde");
        marcadorVerde.setColor("amarillo");

        // Mostramos la información de los marcadores original y clonado.
        System.out.println("Marcador original: " + clonadorMarcadores.clonarMarcador("verde").getColor());
        System.out.println("Marcador clonado modificado: " + marcadorVerde.getColor());
    }
}