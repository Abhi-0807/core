package nitinn;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterdemo {
	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("Nitin.txt");
		String s="shree khimajmatay namah";
		fw.write(s);
		fw.flush();
		fw.close();
		System.out.println("Input data Successfully");
		
		FileReader fr=new FileReader("Nitin.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		
	}

}
