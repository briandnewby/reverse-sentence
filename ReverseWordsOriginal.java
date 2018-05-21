import jsjf.ArrayStack;
import java.util.Scanner;

public class ReverseWordsOriginal 
{
    /* This program should use the Scanner class to input a sentence from the user from the keyboard.
       Each word from the sentence is placed on a stack.
	   Each word is popped off the stack to display the sentence with words in a reverse order.
    */
	   
  public static void main (String[] args) 
  {
	// Declare variables, array, and object
    ArrayStack<String> stack = new ArrayStack<String>();
    String sentence, token, sRepeat;
    char repeat = 'Y';
    Scanner in = new Scanner(System.in);
    
	// Ask user to input a sentence and repeat request if input is blank.
    while (repeat == 'Y'){
      System.out.println("Input a sentence:");
      sentence = in.nextLine();
      
      while (sentence.equals("")){
        System.out.println("Input a sentence:");
        sentence = in.nextLine();
      }      
      Scanner parser = new Scanner(sentence);
      
	  // Push each word of the sentence onto the stack.
      while (parser.hasNext()) {
        token = parser.next();
        stack.push(token);
      }
      
      System.out.println();
      
	  // Remove of each word of the sentence last to first and print it until the stack is empty
      while (!stack.isEmpty()) {
        token = stack.pop();
        System.out.print(token + " ");
      }
	  
	  // Ask the user if he/she wants to reverse another sentence and terminate program if the answer is no.
      System.out.println("\n\nDo you wish to reverse another sentence? Y/N: ");
      sRepeat = in.nextLine();
	  
      while (sRepeat.equals("")) {
        System.out.println("\n\nDo you wish to reverse another sentence? Y/N: ");
        sRepeat = in.nextLine();        
      }
	  
	  repeat = (char) sRepeat.toUpperCase().charAt(0);
	  
	  while (!(repeat == 'Y' || repeat == 'N')) {
		System.out.println("\n\nDo you wish to reverse another snetence? Y/N: ");
		sRepeat = in.nextLine();
		repeat = (char) sRepeat.toUpperCase().charAt(0);
	  }
    }
  }
}