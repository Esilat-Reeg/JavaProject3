package Project_3;
import java.util.Scanner; //scanner allows user to input data

public class Project_3 {

	public static void main(String[] args) {
		// USER INPUT FOR (+) OR (-) NUMBERS
		Scanner sc= new Scanner(System.in);//input from user
		
		System.out.println("Input a number:"); //Print to screen
		
		int num1 = sc.nextInt();

		sc.close();

		
		if (num1 >0) {
			System.out.println("You've picked a positive number");
	
			}
		else if (num1<0) {
			System.out.println("You've picked a negative number");
						
			}
			
		else {
			System.out.println("You've picked zero");
		} 
		
	}

}


