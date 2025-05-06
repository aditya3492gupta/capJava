package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Intro {
	public static void main(String[] args) throws IOException {
		File f = new File("Demo.txt");   //return the object of the file
//		System.out.println(f.exists());
		try {
			System.out.println(f.createNewFile());			
		}catch(IOException e) {
			e.printStackTrace();
		}
//		System.out.println(f.exists());
////		System.out.println(f.delete());
//		System.out.println(f.exists());
//		File arr[] = File.listRoots();
//		for(File file : arr) {
//			System.out.println(file);
//		}
		
//		FileReader fr = new FileReader(f);
//		int data= fr.read();
//		while(data != -1) {
//			System.out.println((char)data);
//			data = fr.read();
//		}
		
		/*Scanner sc = new Scanner(f);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}*/
		
		
//		File f2 = new File("Test.txt");
//		f.renameTo(f2);
		
		
//		FileWriter fw = new FileWriter(f);
//		fw.write("bye");
//		fw.write("bye");
//		fw.write("bye");
//		fw.write("bye");
//		fw.write("bye");
//		fw.write("bye");
//		fw.flush();
		updateLine(f);
//		fw.close();
	}
	public static void updateLine(File f) throws IOException {
		String ans = "";
		Scanner sc = new Scanner (f);
		FileReader fr = new FileReader(f);
		int data= fr.read();
		while(data != -1) {
			ans += (char)(data);
			data = fr.read();
		}
		ans += "ikdnj";
		FileWriter fw = new FileWriter(f);
		fw.write(ans);
		fw.close();
	}
}
