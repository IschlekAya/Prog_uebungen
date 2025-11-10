public class CardGame {
    public static void main(String[] args) {
        Card[] cardList = Card.getCards(10);
        int cardCounter = 1;

        // print names of cards from list of cards
        for (Card card : cardList){
            System.out.println("Karte " + cardCounter + ": " + card.name());
            cardCounter++;
        }
    }
}
