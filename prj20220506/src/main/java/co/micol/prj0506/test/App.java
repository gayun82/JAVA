package co.micol.prj0506.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;


public class App {

	public static void main(String[] args) {
		try {
			Writer os =new FileWriter("c:\\temp\\a.txt");
			String str ="abcdef";
			int a  = 40;
			int b  = 50;
			int c  = 60;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			Reader reader = new FileReader("c:\\temp\\a.txt");
			char[] buffer = new char[100];
			while(true) {
				int charNum = reader.read(buffer);
				if(charNum == -1)break; //파일을 끝을 만나면 EOF
				for(int i=0; i<charNum; i++) {
					System.out.println(buffer[i]);
				}
			}
			//String rstr = reader.toString();
		}catch(Exception e) {
			e.printStackTrace();//바이트는 아스키코드로 출력
		}
		
		}
	}

