package lab.itank;

//control+shift+o : import
import java.io.IOException;
import java.net.Socket;

public class ExceptionEX {

	int a;

	public static void main(String[] args) {
		// ctrl+shift+f:�ڵ�����
		
		Socket socket = null;
		
		try {
			
			socket = new Socket("localhost", 5000);

		} catch (IOException e) {
		
		} finally {
			//���� �߻� ���ο� ������� ����Ǵ� �κ�
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

//���� : ctrl + F11
