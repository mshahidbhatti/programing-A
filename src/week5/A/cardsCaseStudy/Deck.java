import java.util.Random;
public class Deck{

	 Card[] cards;
	private String suits[]={"Spades","Clubs","Hearts","Diamonds"};
	private String ranks[]={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	{
	
		cards=new Card[52];
	}
	public Deck(){
		int counter=0;
		for(int i=0;i<suits.length;i++)
			for(int j=0;j<ranks.length;j++)
				cards[counter++]=new Card(ranks[j],suits[i]);

	}

	public void display(){
		for(int i=0;i<cards.length;i++)
			System.out.println(cards[i].toString());		

	}
	public void shuffle(){
		Random random=new Random();
		for(int i=0;i<6000;i++){
			Card temp=cards[0];
			int ran=random.nextInt(52);
			cards[0]=cards[ran];
			cards[ran]=temp;
		}		

	}


}