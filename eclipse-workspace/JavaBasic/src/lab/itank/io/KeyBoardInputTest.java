package lab.itank.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoardInputTest {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�̸��� ������?==>");
		String name = null;
		try {
			name = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("��ȭ��ȣ ������?==>");
		String tel = null;
		try {
			tel = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name + " ���� ��ȭ��ȣ�� : " + tel + " �Դϴ�.");
	}

}
