import java.util.Random;

public class Card {
    static Random randomGenerator = new Random();
    Suit suit;
    Rank rank;

    Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    // create a card with random attributes
    static Card random(){
        Suit suit = Suit.fromInt(randomGenerator.nextInt(4) + 1);
        Rank rank = Rank.fromInt(randomGenerator.nextInt(13) + 1);
        return new Card(suit, rank);
    }

    // create a list of i random cards
    static Card[] getCards(int i){
        Card[] cardList = new Card[i];
        for (int j = 0; j < i; j++){
            cardList[j] = Card.random();
        }
        return cardList;
    }

    // return the name of a card
    String name(){
        String name = "";
        switch(this.suit){
            case CLUBS:
                name += "Kreuz";
                break;
            case SPADES:
                name += "Pik";
                break;
            case HEARTS:
                name += "Herz";
                break;
            case DIAMONDS:
                name += "Karo";
                break;
        }
        switch(this.rank){
            case TWO:
                name += " Zwei";
                break;
            case THREE:
                name += " Drei";
                break;
            case FOUR:
                name += " Vier";
                break;
            case FIVE:
                name += " Fünf";
                break;
            case SIX:
                name += " Sechs";
                break;
            case SEVEN:
                name += " Sieben";
                break;
            case EIGHT:
                name += " Acht";
                break;
            case NINE:
                name += " Neun";
                break;
            case TEN:
                name += " Zehn";
                break;
            case JACK:
                name += " Bube";
                break;
            case QUEEN:
                name += " Dame";
                break;
            case KING:
                name += " König";
                break;
            case ACE:
                name += " Ass";
                break;
        }
        return name;
    }
}