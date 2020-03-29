package model;

public class Charizard extends Pokemon{
	String characteristics;
	String type;
	String evolution;
	String baseExp;
	public Charizard(String pokemonName, int pokemonNumber,String characteristics,String type,String evolution,String baseExp) {
		super(pokemonName, pokemonNumber);
		this.pokemonName="Charizard";
		this.pokemonNumber=006;
		this.characteristics="Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.";
		this.type="FIRE";
		this.evolution="CHARMELEON	";
		this.baseExp="240";
	}
	
	
	
	public Charizard(String pokemonName, int pokemonNumber) {
		super(pokemonName, pokemonNumber);
		this.characteristics="Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.";
		this.type="FIRE";
		this.evolution="CHARMELEON	";
		this.baseExp="240";
	}



	public Charizard() {
		// TODO Auto-generated constructor stub
	}



	public String getcharacteristics() {
		return characteristics;
	}
	public void setcharacteristics(String characteristics) {
		this.characteristics=characteristics;
	}
	
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type=type;
	}
	
	public String getevolution() {
		return evolution;
	}
	public void setevolution(String evolution) {
		this.evolution=evolution;
	}
	
	public String getbaseExp() {
		return baseExp;
	}
	public void setbaseExp(String baseExp) {
		this.baseExp=baseExp;
	}

}
