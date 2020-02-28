package lab.pkg5_alessandroreyes;

import java.util.ArrayList;

public class Villano {
    private ArrayList<Superpoder> poderesv = new ArrayList(); 
    private String Nombre, Origen; 
    private int Edad, Altura,  muertes;
    private boolean carcel;

    public Villano(String Nombre, String Origen, int Edad, int Altura, int muertes, boolean carcel) {
        this.Nombre = Nombre;
        this.Origen = Origen;
        this.Edad = Edad;
        this.Altura = Altura;
        this.muertes = muertes;
        this.carcel = carcel;
    }

    public ArrayList<Superpoder> getPoderesv() {
        return poderesv;
    }

    public void setPoderesv(ArrayList<Superpoder> poderesv) {
        this.poderesv = poderesv;
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

    public int getMuertes() {
        return muertes;
    }

    public void setMuertes(int muertes) {
        this.muertes = muertes;
    }

    public boolean isCarcel() {
        return carcel;
    }

    public void setCarcel(boolean carcel) {
        this.carcel = carcel;
    }

    @Override
    public String toString() {
        return Nombre + ", de " + Origen;
    }
    
}
