//Main.java

public class Main{
	public static void main(String args[]){
		Deck deck = new Deck();
		System.out.println("---------------Deck Created---------------");
		deck.createDeck();
		System.out.println("---------------Printing Deck---------------");
		deck.displayDeck();
		System.out.println("---------------Shuffled Deck---------------");
		deck.shuffleDeck();
		deck.displayDeck();
		deck.randomCards();
		deck.cardPlayers();
	}
}