public class Game {
    public Card card1;
    public Card[] deck;
    public int count = 0;

    public static void main(String[] args) {
        Game blackjack = new Game();

    }

    public Game() {
        deck = new Card[52];
        int curr = 0;
        for (int s = 0; s < 4; s++) {
            for (int n = 1; n < 14; n++) {
                deck[curr] = new Card(s, n);
                curr++;
            }
        }
        for (int i = 0; i < deck.length; i++) {

        }

//
//        card1 = new Card(2, 2);
//        card1.print();
//        deck = new Card[52];
//        for (int w = 0; w < 4; w++) {
//            for (int e = 0; e < 13; e++) {
//                deck[count] = new Card(e, w);
//                count++;
//
//            }
//        }
        shuffle();

    }
    public void shuffle(){
        Card[] shuffledeck = new Card[52];
        for(int f = 0; f< shuffledeck.length; f++){
            int randomcard = (int)(Math.random()*52);
            Card shufflecard = deck[randomcard];
            while(deck[randomcard].isDealt == true){
                randomcard = (int)(Math.random()*52);
                shufflecard = deck[randomcard];
            }
           deck[randomcard].isDealt=true;
        shufflecard.print();

        shuffledeck[f] = shufflecard;
            }
        deck = shuffledeck;

        }
       // card1.print();
    }


