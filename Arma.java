public class Arma{
    int daño;
    String rareza;


    public Arma(){
        daño = 100;
        rareza = "Comun(verde)";
    }

    public Arma(int daño, String rareza){
        this.daño = daño;
        this.rareza = rareza;
    }

    public int getDaño() {
        return this.daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public String getRareza() {
        return this.rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }
}