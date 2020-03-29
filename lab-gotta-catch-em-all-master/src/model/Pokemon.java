package model;

public class Pokemon {
	String pokemonName;
	int pokemonNumber;
	
	
	public String getpokemonName() {
		return pokemonName;
	}
	public void setpokemonName(String pokemonName) {
		this.pokemonName=pokemonName;
	}
	public int getpokemonNumber() {
		return pokemonNumber;
	}
	public void setpokemonNumber(int pokemonNumber) {
		this.pokemonNumber=pokemonNumber;
	}
	
	public Pokemon(String pokemonName, int pokemonNumber) {
		this.pokemonName=pokemonName;
		this.pokemonNumber=pokemonNumber;
	}
	public Pokemon() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
