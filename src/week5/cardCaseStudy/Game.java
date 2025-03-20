public class Game{
	Deck deck;
	Player players[];

	public Game(int numberOfPlayers){

		deck=new Deck();
		deck.shuffle();
		players=new Player[numberOfPlayers];
players[0]=new Player("player 1",deck.cards.length/numberOfPlayers);
		
		

		

	}

	
	


}


class Player{

	String name;
	Card hand[];
	Player(String name, int maximumCards){
		hand=new Card[maximumCards];
	}

}