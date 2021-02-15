package Project_3_PartII;
import java.util.Scanner; //scanner allows user to input data


public class Project_3_PartII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);//input from user
		
		System.out.println("Please input 3 numbers:");
		
		int num1 = sc.nextInt(); 
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1>num2) {
			if(num1>num3) {
				System.out.println(num1 + " is the greatest number");
 			}
			
			
		}
		
		if (num2>num1) 
		
{
			if (num2>num3) {
				System.out.println(num2 + " is the greatest nunber");
			}
		}
					
		if ((num3>num2) && (num3 > num1)) {
			System.out.println(num3 + " is the greatest number");
			
		}
		}
	}


