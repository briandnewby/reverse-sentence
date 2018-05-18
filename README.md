# reverse-sentence
This was a Java homework assignment. We had to input a sentence and reverse it using whitespace as a delimiter. 
The program is named ReverseWords.java. The program uses a package named jsjf that contains two classes, ArrayStack.java and StackADT.java, which I did not write.
==========================================================================================================================================

import jsjf.ArrayStack;
import java.util.Scanner;

public class ReverseWords {

  public static void main (String[] args) {
    ArrayStack<String> stack = new ArrayStack<String>();
    String sentence, sentence2 = " ", token, sRepeat;
    char repeat = 'Y';
    Scanner in = new Scanner(System.in);
    
    while (repeat == 'Y'){
      System.out.println("Input a sentence:");
      sentence = in.nextLine();
      
      while (sentence.equals("")){
        System.out.println("Input a sentence:");
        sentence = in.nextLine();
      }
      
      Scanner parser = new Scanner(sentence);
      
      while (parser.hasNext()) {
        token = parser.next();
        stack.push(token);
      }
      
      System.out.println();
      
      while (!stack.isEmpty()) {
        token = stack.pop();
        System.out.print(token + " ");
      }
      
      System.out.println("\n\nDo you wish to reverse another sentence? Y/N: ");
      sRepeat = in.nextLine();
      
      while  (sRepeat.equals("")) {
        System.out.println("\n\nDo you wish to reverse another sentence? Y/N: ");
        sRepeat = in.nextLine();        
      }
      
      repeat = (char) sRepeat.toUpperCase().charAt(0);
      
      while (!(repeat == 'Y' || repeat == 'N')) {
        System.out.println("\n\nDo you wish to reverse another sentence? Y/N: ");
        sRepeat = in.nextLine();
        repeat = (char) sRepeat.toUpperCase().charAt(0);
      }
    }
  }
}l
