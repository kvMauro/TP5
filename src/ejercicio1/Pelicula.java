package ejercicio1;

public class Pelicula implements Comparable<Pelicula> {
    private int idPelicula;
    private String nombre;
    private Genero genero;
    private static int contador = 1;

    public Pelicula() {
    }

    public Pelicula(String nombre, Genero genero) {
        this.idPelicula = Pelicula.contador;
        this.nombre = nombre;
        this.genero = genero;
        contador++;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return "idPelicula=" + idPelicula + ", nombre=" + nombre + ", genero=" + genero;
    }

    @Override
    public int compareTo(Pelicula o) {
        if (this.nombre.toLowerCase().replace(" ", "").compareTo(o.nombre.toLowerCase().replace(" ", "")) == 0)
            return this.genero.compareTo(o.genero);
        return this.nombre.compareTo(o.nombre);
    }

    public static void decreaseContador() {
        contador = contador - 1;
    }
}
