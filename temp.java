import java.util.*;
public class temp 
{
   



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // Input number, e.g., 12

        // Calculate the square of the input number
        int squareOfNumber = number * number;

        // Reverse the input number
        int reverseOfNumber = 0;
        int temp = number;
        while (temp != 0) {
            int lastDigitOfNumber = temp % 10;
            reverseOfNumber = reverseOfNumber * 10 + lastDigitOfNumber;
            temp = temp / 10;
        }

        // Calculate the square of the reversed number
        int squareOfReversedNumber = reverseOfNumber * reverseOfNumber;

        // Check if it's an Adam Number
        if (squareOfReversedNumber == squareOfNumber) {
            System.out.println("Adam Number");
        } else {
            System.out.println("Not an Adam Number");
        }
    }

    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        return reverse;
    }
}
    

