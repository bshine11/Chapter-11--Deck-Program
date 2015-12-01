/*************************************
 * Brendan Shine Mr. Kiedes Period 2 * 11-30-15 Deck Program *
 ************************************/

public class Lab11bvst {
	public static void main(String[] args) {
		Deck deck = new Deck();
		System.out.println(deck);
	}
}

class Deck {
	private Card[] cards;
	private int size;


	public Deck() {
		size = 0;
		cards = new Card[52];
		// add all clubs
		add("Clubs", "Two", 2);
		add("Clubs", "Three", 3);
		add("Clubs", "Four", 4);
		add("Clubs", "Five", 5);
		add("Clubs", "Six", 6);
		add("Clubs", "Seven", 7);
		add("Clubs", "Eight", 8);
		add("Clubs", "Nine", 9);
		add("Clubs", "Ten", 10);
		add("Clubs", "Jack", 10);
		add("Clubs", "Queen", 10);
		add("Clubs", "King", 10);
		add("Clubs", "Ace", 11);
		// add all diamonds
		add("Diamonds", "Two", 2);
		add("Diamonds", "Three", 3);
		add("Diamonds", "Four", 4);
		add("Diamonds", "Five", 5);
		add("Diamonds", "Six", 6);
		add("Diamonds", "Seven", 7);
		add("Diamonds", "Eight", 8);
		add("Diamonds", "Nine", 9);
		add("Diamonds", "Ten", 10);
		add("Diamonds", "Jack", 10);
		add("Diamonds", "Queen", 10);
		add("Diamonds", "King", 10);
		add("Diamonds", "Ace", 11);
		// add all hearts
		add("Hearts", "Two", 2);
		add("Hearts", "Three", 3);
		add("Hearts", "Four", 4);
		add("Hearts", "Five", 5);
		add("Hearts", "Six", 6);
		add("Hearts", "Seven", 7);
		add("Hearts", "Eight", 8);
		add("Hearts", "Nine", 9);
		add("Hearts", "Ten", 10);
		add("Hearts", "Jack", 10);
		add("Hearts", "Queen", 10);
		add("Hearts", "King", 10);
		add("Hearts", "Ace", 11);
		// add all spades
		add("Spades", "Two", 2);
		add("Spades", "Three", 3);
		add("Spades", "Four", 4);
		add("Spades", "Five", 5);
		add("Spades", "Six", 6);
		add("Spades", "Seven", 7);
		add("Spades", "Eight", 8);
		add("Spades", "Nine", 9);
		add("Spades", "Ten", 10);
		add("Spades", "Jack", 10);
		add("Spades", "Queen", 10);
		add("Spades", "King", 10);
		add("Spades", "Ace", 11);

	}

	public void add(String suit, String rank, int value) {
		Card temp = new Card(suit, rank, value);
		cards[size] = temp;
		size++;
	}

	public String toString() {
		String temp = "";
		for (int k = 0; k < size; k++)
			temp = temp + cards[k].toString() + "\n";
		return temp;

	}
	private void shuffle(cards){
		
		for(int k=0; k < 1000; k ++){
			int shuffleCards = (int)Math.random()*52;
			cards[shuffleCards];
		}
	} 
}

class Card {
	private String suit;
	private String rank;
	private int value;

	public Card(String suit, String rank, int value) {
		this.suit = suit;
		this.rank = rank;
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public String getRank() {
		return rank;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return "[" + suit + ", " + rank + ", " + value + "]";
	}

}
