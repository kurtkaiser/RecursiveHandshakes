/*
Kurt Kaiser
CTIM 168
08.02.2018
Homework: Recursive Handshakes
Chapter 11 Practice Problem 6
 */

public class RecursiveHandshake
{
    // Use a recursive method to calculate the number of handshakes
    public static int handshake(int n)
    {
        // The base case: 0 or 1 handshakes for <=1 or 2 people
        if (n <= 1)
            return 0;
        else if (n == 2)
            return 1;
        // Each person shakes everyone's hand, subtract one keep going
        return (n-1) + handshake(n-1);
    }

    // Main method to test the handshake method
    public static void main(String[] args)
    {
        int numberOfPeople = 10;
        int result = 0;
        for (int i = 0; i < numberOfPeople + 1; i++)
        {
            result = handshake(i);
        }
        System.out.println("Number of handshakes with " + numberOfPeople +
                " people: " + result);
    }

    /*
     Solving without a recursive method is so much easier, haha
     public static int simpleHandshake(int n){
        if (n < 3){
            return (n-1);
        }
        int result;
        result = (n * (n-1))/2;

    }
    */
}
