package lab.itank;

//control+shift+o : import
import java.io.IOException;
import java.net.Socket;

public class ExceptionEX {

	int a;

	public static void main(String[] args) {
		// ctrl+shift+f:코드정렬
		
		Socket socket = null;
		
		try {
			
			socket = new Socket("localhost", 5000);

		} catch (IOException e) {
		
		} finally {
			//예외 발생 여부와 상관없이 실행되는 부분
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

//실행 : ctrl + F11
