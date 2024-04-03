import java.util.Scanner;

public class Main {

    Deck deck = new Deck();
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("Bienvenido al Poker!");
            System.out.println("Selecciona una opción con su numero:");
            System.out.println("1 Mezclar deck");
            System.out.println("2 Sacar una carta");
            System.out.println("3 Carta al azar");
            System.out.println("4 Generar una mano de 5 cartas");
            System.out.println("5 Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Llama al método para mezclar el deck

                    deck.shuffle();

                    break;
                case 2:
                    // Llama al método para sacar una carta
                    deck.head();
                    break;
                case 3:
                    // Llama al método para obtener una carta al azar

                    deck.pick();
                    break;
                case 4:
                    // Llama al método para generar una mano de 5 cartas
                    deck.hand();
                    break;
                case 0:
                    System.out.println("Fin del Poker");
                    break;
                default:
                    System.out.println("Opción no válida.  intenta de nuevo.");
                    break;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Main principal = new Main();
        principal.showMenu();
    }
}



