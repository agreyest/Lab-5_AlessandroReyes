package lab.pkg5_alessandroreyes;

public class Superpoder {
    private int nivel;
    private boolean mortal;
    private String descripcion;

    public Superpoder(int nivel, boolean mortal, String descripcion) {
        this.nivel = nivel;
        this.mortal = mortal;
        this.descripcion = descripcion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isMortal() {
        return mortal;
    }

    public void setMortal(boolean mortal) {
        this.mortal = mortal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
    
}
