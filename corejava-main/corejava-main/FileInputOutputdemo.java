package nitinn;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputdemo {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("tops.txt");
		String s="This is file management demo using java";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("file written successfully");
		
		FileInputStream fis=new FileInputStream("tops.txt");
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		
	}
	

}
