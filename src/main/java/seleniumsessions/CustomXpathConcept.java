package seleniumsessions;

public class CustomXpathConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//absolute xpath:not recommended
//relative xpath:cutoem xpath :
		//  //tagname[@attribute='value']
		
		//use 2 attributes
		//   //tagname[@attribute1='value'and @attr2='value'] can also use or instead of and 
		//tagname 
		//a   :- use this for links
		//img
		//xpath with text:
		// //tag[text()='value']
		//can also use text with attr using and 
		//a[@href]:get all elements with href property
		
		
		//contains() with attribute
		//tag[contains(@attr,'value')]
		//  //input[contains(@id,'input-email')]
		
		//  		//tag[contains(@attr1,'value') and @attr2='value']
		
		//dynamic attr:
		//     use contains where the attr is dynamic
		// use contains with text:
		// //tag[contains(text(),'value,value']

		
		// contains() with text() and attribute
		//tag[contains(text(),'value') and contains(@attr,'value')]
		// starts-with()
	
		
		
		//position of element using indexing 
		// (//input[@class='form-control'])[2]  --capture group concept
	//togo last element :(//input[@class='form-control'])[last()]
		//(//input[@class='form-control'])[last()-1] for second last elemnt and so on ...
	// get help element on the amazon page :((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]
	
	//parent to child
	//	parent/child -->direct associated element
		// parent//child --> all children associated below that element
	
	//child to parent
		// ex:  //input[@id='input-email']/../.. or instead of ../ we can use 
		// parent::tagname
		
		// for siblings
		// ex:  //input[@id='input-email']/preceding-sibling::label
	//   //label[@for='input-password']/following-sibling::input
	
	//ancestor keyword to jump to the grandparent to avoid all ../../
	
	//example :(//span[text()='Joe Root'])[position()=1]/ancestor::td/following-sibling::td//span/span
		// xpath for getting bowl out by from https://www.espncricinfo.com/series/england-in-india-2023-24-1389386/india-vs-england-1st-test-1389399/full-scorecard
	
	
	//* :- for all 
	
	
	
	}

}
