package cl.praxis.GestorBibliotecas.model.dto;

public class Book {

    private int nroLibro;
    private String titulo;
    private String autor;
    private String tipo;
    private int edicion;

    public Book(int nroLibro){
    }

    public Book(int nroLibro, String titulo, String autor, String tipo, int edicion) {
        this.nroLibro = nroLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.tipo = tipo;
        this.edicion = edicion;
    }

    public int getNroLibro() {
        return nroLibro;
    }

    public void setNroLibro(int nroLibro) {
        this.nroLibro = nroLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
}
