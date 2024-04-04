package StepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginProductionSteps {

	@And("user validates captcha image")
	public void user_validates_captcha_image() {

		System.out.println("@And(\"user validates captcha image\")");

	}

	@And("User enters firstname and last name")
	public void user_enters_firstname_and_last_name(DataTable dataTable) {

		List<List<String>> data = dataTable.asLists();
		
		//First Row and First column
		System.out.println("First name is : " + data.get(0).get(0) + " Last name is : " + data.get(0).get(1));
		
		
		
		//Second Row and Second  column
		System.out.println("First name is : " + data.get(1).get(0) + " Last name is : " + data.get(1).get(1));
		

	
	  List<Map<String, String >> map = dataTable.asMaps();
	 
//	 // First Row and First column System.out.println("First name is : " +
//	  map.get(0).get("Firstname") + " Last name is : " + map.get(0).get("Lastname"));
//		 
//	  // Second Row and Second column System.out.println("First name is : " +
//	  map.get(1).get("Firstname") + " Last name is : " + map.get(1).get("Lastname"));
//	  
	 

	// Assuming dataTable is declared and initialized somewhere in your code

	// Iterating over each map in the dataTable and printing the values
	for (Map<String,String> data1 : dataTable.asMaps(String.class, String.class)) {
	    System.out.println("First name is : " + data1.get("Firstname") + " Last name is : " + data1.get("Lastname"));
	}

	}
	
	
	@Then("user {string} successfully logged in")
	public void user_successfully_logged_in(String string) {
		
		System.out.println("@Then(\"user {string} successfully logged in\")");
		
	}

}
 