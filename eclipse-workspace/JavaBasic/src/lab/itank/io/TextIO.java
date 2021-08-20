package lab.itank.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TextIO {
	public static void main(String[] args) {
		
		//파일에 쓰기
		try {
			FileWriter writer = new FileWriter("Mytext.txt");
			
			writer.write("파란색과 노란색을 더하먼?/녹색\n");
			writer.write("빨간색과 흰색을 더하먼?/분홍색\n");
			
			writer.close();
			
			File myFile = new File("Mytext.txt");
			BufferedReader reader = new BufferedReader(new FileReader(myFile));
			
			String line = null;
			
//			while ((line = reader.readLine()) != null) {
//				System.out.println(line);
//			}
			
			while ((line = reader.readLine()) != null) {
				String[] result = line.split(",");
				
//				System.out.println(result[0]);
//				System.out.println(result[1]);
				
				for (String token : result) {
					System.out.println(token);
				}
				
			}
			reader.close();
			
//			File myFile2 = new File("Mytext.txt");
//			FileReader fileReader = new FileReader(myFile2);
//			System.out.println(fileReader.read());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
