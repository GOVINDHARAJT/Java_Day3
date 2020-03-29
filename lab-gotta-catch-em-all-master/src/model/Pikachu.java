package model;

public class Pikachu extends Pokemon{
	public Pikachu(String pokemonName, int pokemonNumber,String characteristics,String type,String evolution,String baseExp) {
		super(pokemonName, pokemonNumber);
		this.pokemonName="Pikachu";
		this.pokemonNumber=25;
		this.characteristics="Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.";
		this.type="ELECTRIC";
		this.evolution="RAICHU";
		this.baseExp="112";
		// TODO Auto-generated constructor stub
	}
	public Pikachu() {
		// TODO Auto-generated constructor stub
	}
	public Pikachu(String pokemonName, int pokemonNumber) {
		super(pokemonName, pokemonNumber);
		this.characteristics="Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.";
		this.type="ELECTRIC";
		this.evolution="RAICHU";
		this.baseExp="112";
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
