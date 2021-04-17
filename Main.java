import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Arma> armas = new ArrayList<Arma>();
        List<Arma> inventario = new ArrayList<Arma>();
        Espada espada = new Espada();
        Escudo escudo = new Escudo();
        Arco arco = new Arco();
        Personaje personaje = new Personaje("Coeta", "Paladin", 0);
        Mecanicas meca = new Mecanicas();
        int loot;

        espada.setNombre("Quel Serrar");
        escudo.setNombre("Apocalipsis");
        arco.setNombre("Dardo");

        armas.add(espada);
        armas.add(escudo);
        armas.add(arco);

        int size = armas.size();
        for (int i = 1; i <= size; i++) {
            loot = meca.abrirCofre(armas.size());

            System.out.println("Loot " + i + " de " + size + ": " + armas.get(loot).getClass().getName()
                    + " y el personaje es de clase: " + personaje.getClase());

            meca.comprobar(armas.get(loot).getClass().getName(), personaje.getClase());

            System.out.print("¿Quieres 'vender' o 'guardar' el arma? ");
            String respuesta = sc.nextLine();
            if (respuesta.equals("vender")) {
                personaje.setOro(personaje.getOro() + 50);
                armas.remove(loot);
            }
            if (respuesta.equals("guardar")) {
                inventario.add(armas.get(loot));
                armas.remove(loot);
            }
        }

        System.out.println(personaje.getNombre() + " ha ganado " + personaje.getOro()
                + " monedas de oro con la venta de armas que no ha querido");
        System.out.println(
                personaje.getNombre() + " tiene en su inventario " + inventario.size() + " armas que se ha quedado");
        for (int i = 0; i <= inventario.size() - 1; i++) {
            System.out.println(
                    "Arma: " + inventario.get(i).getClass().getName() + ", Daño: " + inventario.get(i).getDaño());
        }
    }
}
