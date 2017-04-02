/*
    This code is supplied and may be used to solve this problem.
*/
import java.util.Scanner;

public class SplitWord
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        // Read in the word
        String word = in.next();

        int wordLength = word.length();
        int i = 0;
        
        while(i < wordLength-1){
            System.out.println(word.substring(i, i + 2));
            i++;
            }
    }
}