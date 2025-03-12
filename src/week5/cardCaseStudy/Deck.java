import java.util.Random;

public class Deck{

	private String suits[]={"Clubs","Diamonds","Hearts","Spades"};
	private String 	ranks[]={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

	Card cards[]=new Card[52];

	public Deck(){
		int counter=0;
		for(int j=0;j<suits.length;j++)
			for(int i=0;i<ranks.length;i++)
				cards[counter++]=new Card(ranks[i],suits[j]);
	}

	public void displayDeck(){
		for(int i=0;i<cards.length;i++)
			System.out.println(cards[i]);

	}
	public void shuffle(){
		Random random=new Random();
		for(int i=0;i<6000;i++)
		{
			Card temp=new Card("","");
			int index=random.nextInt(52);
			temp=cards[0];
			cards[0]=cards[index];
			cards[index]=temp;
		}

	}
	

} 