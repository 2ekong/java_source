package pack3;

public class Ex10Coinln {
	private int coin;
	private int jandon;
	
	
	public void setCoin(int coin) {
		this.coin= coin;
	}
	public void getJandon(int jandon) {
		this.jandon = jandon;
		return;
	}
	public String calc(int cupCount) {
		String re = " ";
		if(coin < 200) {
			re="요금 부족";
		}else if(cupCount *200>coin) {
			re="요금 부족";
		}else {
			jandon = coin-(200*cupCount);
			re = "커피" + cupCount + "잔돈 " + jandon;
			
		}return re;
		
	}
	
	
	
	
	
	
	
}
