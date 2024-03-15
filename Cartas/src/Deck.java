import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;
    private int size;

    public Deck() {
        cards = new ArrayList<>();
        size = 52;
        String[] palos = {"tréboles", "corazones", "picas", "diamantes"};
        String[] colores = {"rojo", "negro"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
        for (String palo : palos) {
            String color = (palo.equals("tréboles") || palo.equals("picas")) ? "negro" : "rojo";
            for (String valor : valores) {
                cards.add(new Card(palo, color, valor));
            }
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            int j = rand.nextInt(size);
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
        System.out.println("Se mezcló el Deck.");
    }

    public Card head() {
        Card card = cards.get(0);
        cards.remove(0);
        size--;
        System.out.println(card);
        System.out.println("Quedan " + size + " cartas en deck");
        return card;
    }

    public Card pick() {
        int randomIndex = (int) (Math.random() * size);
        Card card = cards.get(randomIndex);
        cards.remove(randomIndex);
        size--;
        System.out.println(card);
        System.out.println("Quedan " + size + " cartas en deck");
        return card;
    }

    public List<Card> hand() {
        List<Card> handCards = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            handCards.add(pick());
        }
        return handCards;
    }
}
