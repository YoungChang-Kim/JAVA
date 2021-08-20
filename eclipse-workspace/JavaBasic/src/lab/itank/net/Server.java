package lab.itank.net;

import java.io.*;
import java.net.*;
import java.util.*;

//프로젝트-채팅
//프로젝트-FTP
//9/3


public class Server {
	
	public static void main(String[] args){
	
		new Server().init();
		
	}
	
	public void init(){

		//서버 생성		
		try {
		
			ServerSocket serverSocket = new ServerSocket(5000);
			
			while(true) {
				//클라이언트 요청 승낙
				Socket socket = serverSocket.accept();
				
				//클라이언트에 쓰는 라인 생성
				OutputStream os = socket.getOutputStream();				
				PrintWriter writer = new PrintWriter(os);
				
				String[] message = {};
								
				//연결라인을 자료구조(ArrayList 등)에 추가

				//랜덤3
				Random random = new Random();
				int index = random.nextInt(3);
								
				//클라이언트당 스레스 하나 생성 및 실행준비
				writer.print(message[index]);
				writer.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}
	
	
	//클라이언트들의 내용을 읽고, 
	//모두에게 내용 전달 하는 내부클래스
	public class ClientManager implements Runnable {

		public ClientManager(Socket clientSocket) {

		 //인자로 받은 소켓을 가지고 
		 //클라이언트 내용을 받는 길을 열어 둔다.
		
		}

		public void run() {
			
			//클라이언트들의 내용을 읽고, 
			//sendAll(String message)를 통해 내용을 전달
			//(즉, sendAll()메소드 호출)
			
		}
		
	}
	
	public void sendAll(String message) {
		
		//자료구조에 저장되어 있는 클라이언트에게
		//읽은 내용(인자로 받은 메세지)을 전달한다.
		
	}
	
}
