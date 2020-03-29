package model;

public class Dragonite extends Pokemon{
	public Dragonite(String pokemonName, int pokemonNumber,String characteristics,String type,String evolution,String baseExp) {
		super(pokemonName, pokemonNumber);
		this.pokemonName="Dragonite";
		this.pokemonNumber=149;
		this.characteristics="Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.";
		this.type="DRAGON";
		this.evolution="DRATINI";
		this.baseExp="270";
		// TODO Auto-generated constructor stub
	}
	public Dragonite() {
		// TODO Auto-generated constructor stub
	}
	public Dragonite(String pokemonName, int pokemonNumber) {
		super(pokemonName, pokemonNumber);
		this.characteristics="Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.";
		this.type="DRAGON";
		this.evolution="DRATINI";
		this.baseExp="270";
	}
	String characteristics;
	String type;
	String evolution;
	String baseExp;
	
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
