public class Mecanicas {

    public int abrirCofre(int n) {
        return (int) ((Math.random() * n-1) + 1);
    }

    public boolean comprobar(String arma, String clase) {
        if (clase == "Paladin" && arma == "Espada") {
            System.out.println("Puede llevar este arma");
            return true;
        } else if (clase == "Guerrero" && arma == "Escudo") {
            System.out.println("Puede llevar este arma");
            return true;
        } else if (clase == "Cazador" && arma == "Arco") {
            System.out.println("Puede llevar este arma");
            return true;
        } else {
            System.out.println("NO puede llevar este arma");
            return false;
        }
    }
}