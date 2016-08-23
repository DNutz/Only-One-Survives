package clientServer;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	/*public static void initialize() throws UnknownHostException, IOException {
		integer number, temporary;
		Scanner userInput = new Scanner(System.in);
		Socket socket = new Socket("127.0.0.1",1177);
		Scanner fromServer = new Scanner(socket.getInputStream());
		PrintStream printStream = new PrintStream(socket.getOutputStream());
		System.out.println("Enter any number");
		number = userInput.nextInt();
		ps.println(number);
		temporary = fromServer.nextInt();
		System.out.println(temporary);
	}*/
	
	Socket socket;
	Scanner fromServer;
	PrintStream ps;
	int nextValue;
	
	public void init() throws UnknownHostException, IOException {
		socket = new Socket("127.0.0.1",1177);
		fromServer = new Scanner(socket.getInputStream());
		ps = new PrintStream(socket.getOutputStream());
	}
	
	public void updateOthers(String position){
		//String position = "x,y\n";
		ps.println(position);
	}
	
	public void updateSelf(){
		while (fromServer.hasNextInt()){
			nextValue = fromServer.nextInt();
			System.out.println(nextValue);
		}
	}
	
}
