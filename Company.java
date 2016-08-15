//package project01
public class Company{
	private int profit;
	private int assets;
	private String name;
	private int forbesListIndex;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setProfit(int profit){
		this.profit = profit;
	}
	public int getProfit(){
		return this.profit;
	}
	
	public void setAssets(int assets){
		this.assets = assets;
	}
	public int getAssets(){
		return this.assets;
	}
	
	public void setForbesListIndex(int forbesListIndex){
		this.forbesListIndex = forbesListIndex;
	}
	public int getForbesListIndex(){
		return this.forbesListIndex;
	}
	
}