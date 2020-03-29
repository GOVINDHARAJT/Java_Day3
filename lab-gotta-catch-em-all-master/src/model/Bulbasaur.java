package model;

public class Bulbasaur extends Pokemon{
	
	
	
public Bulbasaur(String pokemonName, int pokemonNumber, String characteristics, String type, String evolution,
			String baseExp) {
		super(pokemonName, pokemonNumber);
		this.characteristics = characteristics;
		this.type = type;
		this.evolution = evolution;
		this.baseExp = baseExp;
	}

//	public Bulbasaur(String pokemonName, int pokemonNumber,String characteristics,String type,String evolution,String baseExp) {
//		super(pokemonName, pokemonNumber);
//		this.pokemonName="Bulbasaur";
//		this.pokemonNumber=001;
//		this.characteristics="Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.";
//		this.type="POISON";
//		this.evolution="IVYSAUR";
//		this.baseExp="64";
//		// TODO Auto-generated constructor stub
//	}
	
	public Bulbasaur() {
		// TODO Auto-generated constructor stub
	}

	public Bulbasaur(String pokemonName, int pokemonNumber) {
		// TODO Auto-generated constructor stub
		this.pokemonName=pokemonName;
		this.pokemonNumber=pokemonNumber;
		this.characteristics="Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.";
		this.type="POISON";
		this.evolution="IVYSAUR";
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
