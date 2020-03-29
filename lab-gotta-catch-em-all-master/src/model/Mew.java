package model;

public class Mew extends Pokemon{

	public Mew(String pokemonName, int pokemonNumber,String characteristics,String type,String evolution,String baseExp) {
		super(pokemonName, pokemonNumber);
		this.pokemonName="Mew";
		this.pokemonNumber=151;
		this.characteristics="Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.";
		this.type="PSYCHIC";
		this.evolution="NONE";
		this.baseExp="64";
		// TODO Auto-generated constructor stub
	}
	public Mew() {
		// TODO Auto-generated constructor stub
	}
	public Mew(String pokemonName, int pokemonNumber) {
		super(pokemonName, pokemonNumber);
		this.characteristics="Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.";
		this.type="PSYCHIC";
		this.evolution="NONE";
		this.baseExp="64";
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
