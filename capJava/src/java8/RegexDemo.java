package java8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d+");
		String ip = "dnej4353jncjd4t5";
		Matcher m = p.matcher(ip);
		int sum = 0;
		while(m.find()) {
			sum += Integer.parseInt(m.group());
		}
		System.out.println(sum);
	}
}
