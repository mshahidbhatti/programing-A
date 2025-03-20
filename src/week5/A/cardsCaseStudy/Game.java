public class Game{

	Deck deck;
	Player players[];
	
	Game(int numberOfPlayers){
		deck=new Deck();
		deck.shuffle();

		

		players =new Player[numberOfPlayers];
		for(int i=0;i<players.length;i++)
			players[i]=new Player(deck.cards.length/numberOfPlayers);

		players[0].hand[0]=deck.cards[51];
		players[1].hand[0]=deck.cards[50];
		deck.cards[51]=null;

	}







}