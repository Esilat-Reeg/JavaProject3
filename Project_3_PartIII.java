package Project_3_PartII;
import java.util.Scanner;
import java.util.Random;


public class Project_3_PartIII {
	
	public static int getRandomNumberUsingNextInt(int min, int max) { 
		
		Random random = new Random(); 
		return random.nextInt(max - min) + min; 
				
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);//input from user
		System.out.println("Input a number: "); //Print to screen
		
		//close scanner object
		sc.close();

		int num = getRandomNumberUsingNextInt(1,7);
		
	
		System.out.println("The random number the program generated is " + num + ".");
		switch(num) {
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;

		case 3: System.out.println("Wednesday");
		break;

		case 4: System.out.println("Thursday");
		break;

		case 5: System.out.println("Friday");
		break;

		case 6: System.out.println("Saturday");
		break;

		case 7: System.out.println("Sunnday");
		break;
		
		default:
			break;

		}
		
	}
	
	

}
