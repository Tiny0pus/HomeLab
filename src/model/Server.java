package model;
// Import I/O and NET for server capabilities and input/output data
import java.io.*;
import java.net.*;

public class Server
{

 // initialize socket and input stream
 private Socket activeSocket = null;
 private ServerSocket server = null;
 private DataInputStream clientInput = null;


 // constructor with port
 public Server(int port)
 {
	 	try
	 	{
	         server = new ServerSocket(port);
	 	}
	    catch (IOException i)
	    {

	        System.out.println(i);
	    }
         
         //implement some sort of logging method here
         //log that we created the socketserver
 }
 
 
 public void start()
 {
	 try
	 {
		 server.accept();
		 
         // takes input from the client socket
         clientInput = new DataInputStream(
             new BufferedInputStream(
                 activeSocket.getInputStream()));
/*
         String line = "";

         // reads message from client until "End" is sent
         while (!line.equals("End")) {

             try {

                 line = in.readUTF();

                 System.out.println(line);
             }

             catch (IOException i) {

                 System.out.println(i);
             }
         }

         System.out.println("Closing connection");

         // close connection
         socket.close();

         in.close();
         
         
            */  
     }

     catch (IOException i)
     {

         System.out.println(i);
      
     }
}
}

