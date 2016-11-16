import java.util.Scanner;

/**

*

* Name: Marsha Guimond
* Teacher: Mr.Hardman

* Assignment 4, Program 2

* Date Last Modified: November 9, 2016

*

*/
/**
 * 
 */

/**
 * @author m.guimond3
 *
 */
public class ControlStructures {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		double userWeight;
		double celestialWeight;
		String body;
		
		do{
			
			System.out.println("Print enter your weight: ");
			userWeight = userInput.nextDouble();
			
			if(userWeight<1){
				System.out.println("Enter a number greater than zero.");
				
			}
			
			
		} while(userWeight<1);
		
		System.out.println("Please pick one of the following celestial bodies: Mercury, Venus, Earth, Moon, Mars, Jupiter, Saturn, Uranus, Neptune, Pluto.");
		body = userInput.next();
		
		do {
			
		 if (!body.equalsIgnoreCase("Mercury") && !body.equalsIgnoreCase("Venus") && !body.equalsIgnoreCase("Earth") && !body.equalsIgnoreCase("Moon") && !body.equalsIgnoreCase("Mars") && !body.equalsIgnoreCase("Jupiter") && !body.equalsIgnoreCase("Saturn") && !body.equalsIgnoreCase("Uranus") && !body.equalsIgnoreCase("Neptune") && !body.equalsIgnoreCase("Pluto"));
		 	System.out.println("Please choose one given to you!");
		 	body = userInput.next();
		   
		 
	} while(!body.equalsIgnoreCase("Mercury") && !body.equalsIgnoreCase("Venus") && !body.equalsIgnoreCase("Earth") && !body.equalsIgnoreCase("Moon") && !body.equalsIgnoreCase("Mars") && !body.equalsIgnoreCase("Jupiter") && !body.equalsIgnoreCase("Saturn") && !body.equalsIgnoreCase("Uranus") && !body.equalsIgnoreCase("Neptune") && !body.equalsIgnoreCase("Pluto"));
	
		
		if (body.equalsIgnoreCase("Mercury")){
			celestialWeight = userWeight * (0.38);
			System.out.println("Your weight would be " + celestialWeight + ".");
			
		}
		
		if (body.equalsIgnoreCase("Venus")){
			celestialWeight = userWeight * (0.91);
			System.out.println("Your weight would be " + celestialWeight + ".");
			
		}
		
		if (body.equalsIgnoreCase("Earth")){
			celestialWeight = userWeight * (1);
			System.out.println("Your weight would be " + celestialWeight + ".");
			
		}
		
		if (body.equalsIgnoreCase("Moon")){
			celestialWeight = userWeight * (0.165);
			System.out.println("Your weight would be " + celestialWeight + ".");
			
  		}

		if (body.equalsIgnoreCase("Mars")){
			celestialWeight = userWeight * (0.38);
			System.out.println("Your weight would be " + celestialWeight + ".");
			
		}
		
		if (body.equalsIgnoreCase("Jupiter")){
			celestialWeight = userWeight * (2.34);
			System.out.println("Your weight would be " + celestialWeight + ".");
			
		}
		
		if (body.equalsIgnoreCase("Saturn")){
			celestialWeight = userWeight * (1.06);
			System.out.println("Your weight would be " + celestialWeight + ".");
			
		}
		
		if (body.equalsIgnoreCase("Uranus")){
			celestialWeight = userWeight * (0.92);
			System.out.println("Your weight would be " + celestialWeight + ".");
			
		}
		
		if (body.equalsIgnoreCase("Neptune")){
			celestialWeight = userWeight * (1.19);
			System.out.println("Your weight would be " + celestialWeight + ".");
			
		}
		
		if (body.equalsIgnoreCase("Pluto")){
			celestialWeight = userWeight * (0.06);
			System.out.println("Your weight would be " + celestialWeight + ".");
		
		}
		
		userInput.close();
	}
}

	


	