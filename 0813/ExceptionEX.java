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
			System.out.println("UnknownHostException �߻��Ͽ����ϴ�.");

		}catch (IOException e){
			System.out.println("IOException �߻��Ͽ����ϴ�.");

		}catch (Exception e){
			System.out.println("Exception �߻��Ͽ����ϴ�.");

		}

	}
}
