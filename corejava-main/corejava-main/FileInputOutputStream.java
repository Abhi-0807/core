package nitinn;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputStream {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("TOPS.txt");
		String s="jai Shree Ram";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("Har Har Mahadev");
		
		FileInputStream fis=new FileInputStream("TOPS.txt");
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		
	}

}
