package model;
import java.util.HashMap;
import java.util.Map;
public class ClonadorMarcadores {
    private Map<String, Marcador> marcadores = new HashMap<>();

    // Constructor que inicializa algunos marcadores.
    public ClonadorMarcadores() {
        Marcador marcadorVerde = new Marcador("verde", "fino");
        Marcador marcadorRojo = new Marcador("rojo", "grueso");
        marcadores.put("verde", marcadorVerde);
        marcadores.put("rojo", marcadorRojo);
    }

    // Método que permite añadir nuevos marcadores al clonador.
    public void agregarMarcador(String nombre, Marcador marcador) {
        marcadores.put(nombre, marcador);
    }

    // Método que devuelve una copia clonada del marcador con el nombre especificado.
    public Marcador clonarMarcador(String nombre) {
        Marcador marcador = marcadores.get(nombre);
        return marcador.clone();
    }
}
