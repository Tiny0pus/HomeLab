package controller;
import model.*;
import view.*;
public class Controller
{
	// Zero param constructor for Controller
	private Server server;
	public Controller()
	{
		//init the serverSocket, creates a ServerSocket, doesnt start it.
		server = new Server(Constants.SERVER_PORT);
		
		//connect to a database of some sort
		
		//init other things (services,
	}
	
	
	public void start()
	{
		
		
		
		
		//makes the server begin listening on the specifed port
		server.start();
		
		
				
		
		
		
	}
	
}


