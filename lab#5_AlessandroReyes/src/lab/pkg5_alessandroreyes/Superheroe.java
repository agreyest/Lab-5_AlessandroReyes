package lab.pkg5_alessandroreyes;

import java.util.ArrayList;

public class Superheroe {
    private ArrayList<Superpoder> poderes = new ArrayList(); 
    private String Nombre, Origen; 
    private int Edad, Altura,  vatrap;

    public Superheroe() {
    }

    public Superheroe(String Nombre, String Origen, int Edad, int Altura, int vatrap) {
        this.Nombre = Nombre;
        this.Origen = Origen;
        this.Edad = Edad;
        this.Altura = Altura;
        this.vatrap = vatrap;
    }

    public ArrayList<Superpoder> getPoderes() {
        return poderes;
    }

    public void setPoderes(ArrayList<Superpoder> poderes) {
        this.poderes = poderes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public int getVatrap() {
        return vatrap;
    }

    public void setVatrap(int vatrap) {
        this.vatrap = vatrap;
    }

    @Override
    public String toString() {
        return Nombre + ", de " + Origen;
    }
    
}
