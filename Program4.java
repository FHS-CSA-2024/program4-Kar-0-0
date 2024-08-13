//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter your first digit: ");
        int num1 = myScanner.nextInt();
        System.out.println("Enter your second digit: ");
        int num2 = myScanner.nextInt();
        System.out.println("Enter your third digit: ");
        int num3 = myScanner.nextInt();
        System.out.println("Enter your fourth digit: ");
        int num4 = myScanner.nextInt();
        
        int numSum = num1 + num2 + num3 + num4;
        double avg = numSum / 4.0;
        
        System.out.println("The sum of the four numbers is: " + numSum);
        System.out.println();
        System.out.println("The average of the four numbers is " + avg);
        
        
    }
}

//Paste console output below:
/*
Enter your first digit: 
475
Enter your second digit: 
821
Enter your third digit: 
369
Enter your fourth digit: 
562
The sum of the four numbers is: 2227

The average of the four numbers is 556.75

*/
