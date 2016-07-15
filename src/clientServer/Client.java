package clientServer;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String args[]) throws UnknownHostException, IOException {
		int number, temp;
		Scanner userInput = new Scanner(System.in);
		Socket socket = new Socket("127.0.0.1",1177);
		Scanner fromServer = new Scanner(socket.getInputStream());
		PrintStream ps = new PrintStream(socket.getOutputStream());
		System.out.println("Enter any number");
		number = userInput.nextInt();
		ps.println(number);
		temp = fromServer.nextInt();
		System.out.println(temp);
	}
	
}
