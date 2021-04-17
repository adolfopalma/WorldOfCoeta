public class Arco extends Arma{
    String nombre, tipo;
    int agilidad;

    public Arco(){
        nombre = "Elfiarco";
        tipo = "Arco";
        agilidad = 50;
    }

    public Arco(String nombre, String tipo, int agilidad){
        this.nombre = nombre;
        this.tipo = tipo;
        this.agilidad = agilidad;
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

    public int getAgilidad() {
        return this.agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }
}
