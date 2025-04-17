package dataStructure;

public class BrowserStackDriver {
	public static void main(String[] args) {
		BrowserLogic browser = new BrowserLogic();
		browser.visit("gfg");
		browser.visit("gpt");
//		browser.print();
		browser.back();
//		browser.print();
		browser.visit("yt");
		browser.print();
		browser.back();
		browser.forward();
		browser.print();
	}
}
