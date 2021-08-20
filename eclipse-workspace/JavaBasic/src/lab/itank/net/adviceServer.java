package lab.itank.net;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class adviceServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(5000);
			
			while(true) {
				Socket socket = serverSocket.accept();
				
				OutputStream os = socket.getOutputStream();
				
				PrintWriter writer = new PrintWriter(os);
				
				String[] message = {"힘내!!", "넌 할 수 있어!!", "끝까지 가는거야~~"};
				
				//랜덤3
				Random random = new Random();
				int index = random.nextInt(3);
				
				writer.print(message[index]);
				
				writer.close();
			}			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
