public class Card {
  public String suit;
  public int value;
  public String name;
  public boolean isDealt;


    public Card(int psuit, int pname) {
        if (psuit == 0) {
            suit = "diamond";
        }
        if (psuit == 1) {
            suit = "spades";
        }
        if (psuit == 2) {
            suit = "heart";
        }
        if (psuit == 3) {
            suit = "club";
        }

        if (pname == 1) {
            name = "Ace";
        }
        if (pname == 2) {
            name = "2";
        }
        if (pname == 3) {
            name = "3";
        }
        if (pname == 4) {
            name = "4";
        }
        if (pname == 5) {
            name = "5";
        }
        if (pname == 6) {
            name = "6";
        }
        if (pname == 7) {
            name = "7";
        }
        if (pname == 8) {
            name = "8";
        }
        if (pname == 9) {
            name = "9";
        }
        if (pname == 10) {
            name = "king";
        }
        if (pname == 11) {
            name = "queen";
        }
        if (pname == 12) {
            name = "jack";
        }
    }
    public void print(){
        System.out.println("your card is " +name + " of " + suit);
    }
}
