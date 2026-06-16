package model;

/**
 * Clase Tour
 * Aquí van las variables, el constructor,, los getters y setters, y un toString
 */
public class Tour {

    private String nombre;
    private String tipo;
    private int precio;

    /**
     * @param nombre
     * @param tipo
     * @param precio
     */
    public Tour (String nombre, String tipo, int precio){
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    /**
     * Getters y Setters + un toString
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Tour: " + nombre + "   Tipo: " + tipo + "   Precio: " + precio;
    }
}