package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bulbasaur;
import model.Charizard;
import model.Dragonite;
import model.Mew;
import model.Pikachu;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";

		if (value1 != null) {
			
			Bulbasaur bulbasaur=new Bulbasaur();
			// Create the object for Bulbasaur class and use getters to retrieve the values	
		
		//	msg = "<center>" +  + "  #" + //getter;
			//request.setAttribute("message2",bulbasaur.getcharacteristics());
			request.setAttribute("character2",bulbasaur.getcharacteristics());
			request.setAttribute("type2",bulbasaur.gettype());
			request.setAttribute("evolution2", bulbasaur.getevolution());
			request.setAttribute("baseExp2", bulbasaur.getbaseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			Charizard charizard=new Charizard();
			  
			//msg = "<center>" + //getter + "  #" + //getter;
		//	request.setAttribute("message2",//getter);
			request.setAttribute("character2",charizard.getcharacteristics());
			request.setAttribute("type2",charizard.gettype());
			request.setAttribute("evolution2",charizard.getevolution());
			request.setAttribute("baseExp2", charizard.getbaseExp());
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	
			Dragonite dragonite =new Dragonite();
			  
		//	msg = "<center>" + //getter + "  #" + //getter;
		//	request.setAttribute("message2",//getter);
			request.setAttribute("character2", dragonite.getcharacteristics());
			request.setAttribute("type2",dragonite.gettype());
			request.setAttribute("evolution2", dragonite.getevolution());
			request.setAttribute("baseExp2",dragonite.getbaseExp());
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			Mew mew=new Mew();
		//	msg = "<center>" + //getter + "  #" + //getter;
		//	request.setAttribute("message2",//getter);
			request.setAttribute("character2", mew.getcharacteristics());
			request.setAttribute("type2",mew.gettype());
			request.setAttribute("evolution2", mew.getevolution());
			request.setAttribute("baseExp2", mew.getbaseExp());
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
			Pikachu pikachu=new Pikachu();
			  
		//	msg = "<center>" + //getter + "  #" + //getter;
		//	request.setAttribute("message2",//getter);
			request.setAttribute("character2", pikachu.getcharacteristics());
			request.setAttribute("type2",pikachu.gettype());
			request.setAttribute("evolution2", pikachu.getevolution());
			request.setAttribute("baseExp2", pikachu.getbaseExp());

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
