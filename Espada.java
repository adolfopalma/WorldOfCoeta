public class Espada extends Arma{
    String nombre, tipo;
    int fuerza;

    public Espada(){
        nombre = "Excalibur";
        tipo = "Espada";
        fuerza = 50;
    }

    public Espada(String nombre, String tipo, int fuerza){
        this.nombre = nombre;
        this.tipo = tipo;
        this.fuerza = fuerza;
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

    public int getFuerza() {
        return this.fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}
