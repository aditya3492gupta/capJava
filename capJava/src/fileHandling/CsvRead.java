package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CsvRead {
	public static void main(String[] args) throws IOException  {
		File f = new File("Demo.csv");
//		try {
//			System.out.println(f.createNewFile());			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		Scanner sc = new Scanner(f);
//		sc.useDelimiter(",");
//		while(sc.hasNextLine()) {
//			System.out.print(sc.next() + "\t");
//		}
		
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
//		System.out.println(br.readLine());
		String line = br.readLine();
		while(line != null) {
			String data[] = line.split(",");
			for(String s : data) {
				System.out.print(s + "\t");
			}
			System.out.println();
			line = br.readLine();
		}
//		String data[] = line.split(",");
//		for(String s : data) {
//			System.out.print(s + "\t");
//		}
	}
}
