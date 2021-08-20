package lab.itank.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoardInputTest {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름이 뭐예요?==>");
		String name = null;
		try {
			name = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("전화번호 뭐예요?==>");
		String tel = null;
		try {
			tel = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name + " 님의 전화번호는 : " + tel + " 입니다.");
	}

}
