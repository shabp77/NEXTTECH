package javapractice;

import java.util.HashMap;

public class Lec5hashmap {

	public static void main(String[] args) {
		//HashMap<datatype, datatype> variable name= new HashMap <datatype, datatype>();
		
		
		HashMap<String, String> capital= new HashMap<String, String>();
		
		
		
		//store  3 cities name of Texas 
		
		
	capital.put("TX", "Dallas");
	capital.put("TX", "Irving");
	capital.put("TX", "Plano");
	capital.put("NY", "Brooklyn");
	capital.put("NY",  "Jamaika City");
	
	System.out.println(capital);
	capital.remove("NY");
	System.out.println("NY");
	//
	//add Student name and ID
	
 HashMap< String, Integer>Student= new HashMap <String, Integer>();
	// add Student name and ID
	
	Student.put("Polly", 12);
	Student.put("Ria", 34);
	Student.put("Mafin", 56);
	System.out.println(Student);
	
	
	//add cities and zipcode
	HashMap<String, Integer>cities=new HashMap<String, Integer>();
	
	cities.put("Lilburn Zip", 30047);
	cities.put("Snellville Zip", 30044);
	cities.put("Stone Mountain Zip", 30078);
	cities.put("Dacula", 30052);
	
	System.out.println(cities);
		
	
	
	
	

	
	
	
	
		
		
		

	}

}
