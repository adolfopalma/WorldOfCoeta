public class Personaje {
    String nombre, clase;
    int oro;

    public Personaje(){
        nombre = "Coeta";
        clase = "Paladin";
        oro = 0;
    }

    public Personaje(String nombre, String clase, int oro){
        this.nombre = nombre;
        this.clase = clase;
        this.oro = oro;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return this.clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getOro() {
        return this.oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

}
