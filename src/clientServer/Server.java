package clientServer;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String args[]) throws IOException{
		int number, temp;
		ServerSocket servSock = new ServerSocket(1177);
		Socket socket =  servSock.accept();
		Scanner fromClient= new Scanner(socket.getInputStream());
		//number = fromClient.nextInt();
		//temp = number;
		while (fromClient.hasNextLine()){
			String xy = fromClient.nextLine();
			PrintStream ps = new PrintStream(socket.getOutputStream());
			ps.println(xy);
			System.out.println(xy);
		}
	}
}
