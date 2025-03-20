public class Card{


	private final String RANK;
	private final String SUIT;

	Card(String rank, String suit){
		this.SUIT=suit;
		this.RANK=rank;

	}

	public String getSuit(){
		return SUIT;
	}
	public String getRank(){
		return RANK;
	}

	public String toString(){
		return RANK + " of "+SUIT;
	}


}