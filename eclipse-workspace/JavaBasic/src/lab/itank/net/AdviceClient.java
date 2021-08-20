package lab.itank.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class AdviceClient {

	public static void main(String[] args) {
		try {
			
			Socket socket = new Socket("183.101.18.130", 5000);
			InputStreamReader stream = new InputStreamReader(socket.getInputStream());			
			BufferedReader reader = new BufferedReader(stream);
			
			String message = reader.readLine();
			System.out.println(message);
			reader.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
