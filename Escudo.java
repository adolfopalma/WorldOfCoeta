public class Escudo extends Arma{
    String nombre, tipo;
    int defensa;

    public Escudo() {
        nombre = "Imfernito";
        tipo = "Escudo";
        defensa = 50;
    }

    public Escudo(String nombre, String tipo, int defensa) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.defensa = defensa;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDefensa() {
        return this.defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
}
