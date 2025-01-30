package ejercicio1;

public class Genero implements Comparable<Genero> {
    private String nombre;

    public Genero() {
    }

    public Genero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(Genero o) {
        return this.nombre.compareTo(o.nombre);
    }
}
