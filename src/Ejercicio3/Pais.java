package Ejercicio3;

public class Pais implements Comparable<Pais> {
    private String nombre;
    private String continente;
    private int poblacion;
    private String capital;

    public  Pais(String nombre, String continente, int poblacion) {
        this.nombre = nombre;
        this.continente = continente;
        this.poblacion = poblacion;
    }

    public Pais(String nombre, String continente, int poblacion, String capital) {
        this.nombre = nombre;
        this.continente = continente;
        this.poblacion = poblacion;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int compareTo(Pais pais) {
        return this.continente.compareTo(pais.continente);
    }
}
