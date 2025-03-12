public class Card{
	
	private final String RANK;
	private final String SUIT;

	public Card(String rank, String suit){
		this.RANK=rank;
		this.SUIT=suit;
	}
	
	public String toString(){
		return String.format("%s of %s",RANK,SUIT);
	}
	public String getRANK(){
		return RANK;
	}
	public String getSUIT(){
		return SUIT;
	}


}