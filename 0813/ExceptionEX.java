import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;

public class ExceptionEX{
		//throws UnknownHostException, IOException
	public static void main(String[] args){
		try{
			Socket socket = new Socket("localhost", 5000);
			//...

		}catch (UnknownHostException e){
			System.out.println("UnknownHostException 발생하였습니다.");

		}catch (IOException e){
			System.out.println("IOException 발생하였습니다.");

		}catch (Exception e){
			System.out.println("Exception 발생하였습니다.");

		}

	}
}
