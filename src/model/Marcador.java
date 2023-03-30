package model;

public class Marcador implements Cloneable{
    private String color;
    private String tipoPunta;

    // Constructor que recibe el color y tipo de punta del marcador.
    public Marcador(String color, String tipoPunta) {
        this.color = color;
        this.tipoPunta = tipoPunta;
    }
    public void setColor(String color) {
        this.color = color;
    }
    // Método que devuelve el color del marcador.
    public String getColor() {
        return color;
    }

    // Método que devuelve el tipo de punta del marcador.
    public String getTipoPunta() {
        return tipoPunta;
    }

    // Método clone() que realiza la clonación del marcador.
    @Override
    public Marcador clone() {
        try {
            return (Marcador) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
