package seleniumsessions;

public class Amazontest {

	public static void main(String[] args) {
		
		String browserName="chrome";
		BrowserUtil util=new BrowserUtil();
		util.initDriver(browserName);
util.launchUrl("https://www.amazon.com");

String title=util.getPageTitle();
if(title.contains("amazon")) {
	System.out.println("pass");
}
else {
	System.out.println("fail");

}

String url=util.getPageUrl();
if(url.contains("amazon")) {
	System.out.println("pass");
}

else {
	System.out.println("fail");
}

}

}
